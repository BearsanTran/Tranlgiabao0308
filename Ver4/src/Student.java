
import java.util.Date;

public class Student extends Person {
    private float gpa;
    private String major;

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void addPerson() {
        // Implementation for adding student
    }

    @Override
    public void updatePerson(String id) {
        // Implementation for updating student by id
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId() + ", Name: " + getFullName() + ", Date of Birth: " + getDateOfBirth() +
                ", GPA: " + gpa + ", Major: " + major);
    }

    float getGpa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
