import java.util.Date;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Options: \n1. Add Student\n2. Add Teacher\n3. Update Person\n4. Delete Person by ID\n5. Find Person by ID\n6. Display Everyone\n7. Find Top Student\n8. Find Teacher by Department\n9. Exit");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Adding a new student
                    System.out.println("Enter student details (id, name, date of birth, GPA, major):");
                    String studentId = scanner.next();
                    String studentName = scanner.next();
                    Date studentDob = new Date(); // For simplicity
                    float gpa = scanner.nextFloat();
                    String major = scanner.next();
                    Student student = new Student(studentId, studentName, studentDob, gpa, major);
                    personList.addStudent(student);
                    break;

                case 2:
                    // Adding a new teacher
                    System.out.println("Enter teacher details (id, name, date of birth, department, subject):");
                    String teacherId = scanner.next();
                    String teacherName = scanner.next();
                    Date teacherDob = new Date(); // For simplicity
                    String department = scanner.next();
                    String subject = scanner.next();
                    Teacher teacher = new Teacher(teacherId, teacherName, teacherDob, department, subject);
                    personList.addTeacher(teacher);
                    break;

                case 3:
                    // Update a person
                    System.out.println("Enter person ID to update:");
                    String idToUpdate = scanner.next();
                    // (Process similar to addStudent/addTeacher)
                    break;

                case 4:
                    // Delete person by ID
                    System.out.println("Enter person ID to delete:");
                    String idToDelete = scanner.next();
                    personList.deletePersonById(idToDelete);
                    break;

                case 5:
                    // Find person by ID
                    System.out.println("Enter person ID to find:");
                    String idToFind = scanner.next();
                    Person foundPerson = personList.findPersonById(idToFind);
                    if (foundPerson != null) {
                        foundPerson.displayInfo();
                    } else {
                        System.out.println("Person not found.");
                    }
                    break;

                case 6:
                    // Display all persons
                    personList.displayEveryone();
                    break;

                case 7:
                    // Find top student
                    Student topStudent = personList.findTopStudent();
                    if (topStudent != null) {
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students found.");
                    }
                    break;

                case 8:
                    // Find teacher by department
                    System.out.println("Enter department:");
                    String dept = scanner.next();
                    Teacher foundTeacher = personList.findTeacherByDepartment(dept);
                    if (foundTeacher != null) {
                        foundTeacher.displayInfo();
                    } else {
                        System.out.println("Teacher not found.");
                    }
                    break;

                case 9:
                    // Exit
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
