


import java.util.Date;
import java.util.Scanner;


public class Processor {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Options: ");
            System.out.println("1. Add a new student");
            System.out.println("2. Update a student by id");
            System.out.println("3. Delete a student by id");
            System.out.println("4. Display all students");
            System.out.println("5. Find the student with the highest GPA");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.next();
                    System.out.print("Enter Full Name: ");
                    String fullName = scanner.next();
                    System.out.print("Enter Date of Birth (as long timestamp): ");
                    long dobLong = scanner.nextLong();
                    Date dob = new Date(dobLong);
                    System.out.print("Enter GPA: ");
                    float gpa = scanner.nextFloat();
                    System.out.print("Enter Major: ");
                    String major = scanner.next();

                    studentList.addStudent(new Student(id, fullName, dob, gpa, major));
                    break;

                case 2:
                    System.out.print("Enter ID of student to update: ");
                    id = scanner.next();
                    System.out.print("Enter new Full Name: ");
                    fullName = scanner.next();
                    System.out.print("Enter new Date of Birth (as long timestamp): ");
                    dobLong = scanner.nextLong();
                    dob = new Date(dobLong);
                    System.out.print("Enter new GPA: ");
                    gpa = scanner.nextFloat();
                    System.out.print("Enter new Major: ");
                    major = scanner.next();

                    studentList.updateStudentById(id, fullName, dob, gpa, major);
                    break;

                case 3:
                    System.out.print("Enter ID of student to delete: ");
                    id = scanner.next();
                    studentList.deleteStudentById(id);
                    break;

                case 4:
                    studentList.displayAllStudents();
                    break;

                case 5:
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Student with the highest GPA:");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students available.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }
}
