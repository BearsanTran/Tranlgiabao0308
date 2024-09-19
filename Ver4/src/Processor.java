import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonList personList = new PersonList();

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by id");
            System.out.println("4. Delete person by id");
            System.out.println("5. Display all students and teachers");
            System.out.println("6. Find the student with the highest GPA");
            System.out.println("7. Find teachers by department");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter full name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter date of birth (yyyy-mm-dd): ");
                    Date studentDob = Date.valueOf(scanner.nextLine());
                    System.out.print("Enter GPA: ");
                    float gpa = scanner.nextFloat();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter major: ");
                    String major = scanner.nextLine();
                    Student student = new Student(studentId, studentName, studentDob, gpa, major);
                    personList.addStudent(student);
                }

                case 2 -> {
                    System.out.print("Enter teacher ID: ");
                    String teacherId = scanner.nextLine();
                    System.out.print("Enter full name: ");
                    String teacherName = scanner.nextLine();
                    System.out.print("Enter date of birth (yyyy-mm-dd): ");
                    Date teacherDob = Date.valueOf(scanner.nextLine());
                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter teaching subject: ");
                    String subject = scanner.nextLine();
                    Teacher teacher = new Teacher(teacherId, teacherName, teacherDob, department, subject);
                    personList.addTeacher(teacher);
                }

                case 3 -> {
                    System.out.print("Enter person ID to update: ");
                    String updateId = scanner.nextLine();
                    personList.updatePerson(updateId);
                }

                case 4 -> {
                    System.out.print("Enter person ID to delete: ");
                    String deleteId = scanner.nextLine();
                    personList.deletePersonById(deleteId);
                }

                case 5 -> personList.displayEveryone();

                case 6 -> {
                    Student topStudent = personList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Top student:");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students available.");
                    }
                }

                case 7 -> {
                    System.out.print("Enter department: ");
                    String searchDepartment = scanner.nextLine();
                    ArrayList<Teacher> teachers = personList.findTeacherByDepartment(searchDepartment);
                    for (Teacher t : teachers) {
                        t.displayInfo();
                    }
                }

                case 8 -> {
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                }

                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }
}
