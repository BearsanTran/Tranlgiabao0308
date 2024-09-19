import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) throws ParseException {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        while (true) {
            System.out.println("1. Add new student");
            System.out.println("2. Update student by ID");
            System.out.println("3. Delete student by ID");
            System.out.println("4. Display all students");
            System.out.println("5. Find top GPA student");
            System.out.println("6. Display scholarship students");
            System.out.println("7. Display total tuition of all students");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter full name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter date of birth (yyyy-MM-dd): ");
                    String dob = scanner.nextLine();
                    System.out.print("Enter GPA: ");
                    float gpa = scanner.nextFloat();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter major: ");
                    String major = scanner.nextLine();
                    Date dateOfBirth = sdf.parse(dob);
                    Student newStudent = new Student(id, fullName, dateOfBirth, gpa, major);
                    studentList.addStudent(newStudent);
                    break;
                case 2:
                    System.out.print("Enter student ID to update: ");
                    String updateId = scanner.nextLine();
                    Student studentToUpdate = studentList.findStudentById(updateId);
                    if (studentToUpdate != null) {
                        System.out.print("Enter new GPA: ");
                        float newGpa = scanner.nextFloat();
                        studentToUpdate.setGpa(newGpa);
                        System.out.print("Enter new major: ");
                        scanner.nextLine(); // consume newline
                        String newMajor = scanner.nextLine();
                        studentToUpdate.setMajor(newMajor);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    studentList.deleteStudentById(deleteId);
                    break;
                case 4:
                    studentList.displayAllStudents();
                    break;
                case 5:
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Top GPA student:");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students found!");
                    }
                    break;
                case 6:
                    ArrayList<Student> scholarshipStudents = studentList.findScholarshipStudents();
                    if (!scholarshipStudents.isEmpty()) {
                        System.out.println("Scholarship students:");
                        for (Student student : scholarshipStudents) {
                            student.displayInfo();
                            System.out.println("----------------");
                        }
                    } else {
                        System.out.println("No students with scholarship found!");
                    }
                    break;
                case 7:
                    double totalTuition = studentList.calculateTuitionOfAllStudents();
                    System.out.println("Total tuition of all students: " + totalTuition);
                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
