package Ver1;
import java.util.ArrayList;
import java.util.Date;

class StudentList {

    private ArrayList<Ver1.Student> studentList;

    public StudentList() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Ver1.Student student) {
        studentList.add(student);
    }

    public void updateStudentById(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        Ver1.Student student = findStudentById(id);
        if (student != null) {
            student.setFullName(fullName);
            student.setDateOfBirth(dateOfBirth);
            student.setGpa(gpa);
            student.setMajor(major);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void deleteStudentById(String id) {
        studentList.removeIf(student -> student.getId().equals(id));
    }

    public Ver1.Student findStudentById(String id) {
        for (Ver1.Student student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Ver1.Student student : studentList) {
                student.displayInfo();
            }
        }
    }

    public Ver1.Student findTopStudent() {
        if (studentList.isEmpty()) {
            return null;
        }

        Ver1.Student topStudent = studentList.get(0);
        for (Ver1.Student student : studentList) {
            if (student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }
        return topStudent;
    }
}
