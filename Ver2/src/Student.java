import java.util.Date;

final class Student extends Person implements IPerson {
    private float gpa;
    private String major;
    private double tuition;
    private boolean scholarship;
    private String id;
    private String fullName;
    private String dateOfBirth;

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
        this.scholarship = gpa >= 9;
        this.tuition = calculateTuition();
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
        this.scholarship = gpa >= 9;
        this.tuition = calculateTuition();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getTuition() {
        return tuition;
    }

    public boolean hasScholarship() {
        return scholarship;
    }

    public double calculateTuition() {
        return scholarship ? 10000000 * 0.5 : 10000000;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
        System.out.println("Tuition: " + tuition);
        System.out.println("Scholarship: " + (scholarship ? "Yes" : "No"));
    }

    @Override
    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
