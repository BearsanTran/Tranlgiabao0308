import java.util.ArrayList;

public class PersonList {
    private ArrayList<Person> personList;

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    // Add a new student
    public void addStudent(Student student) {
        personList.add(student);
    }

    // Add a new teacher
    public void addTeacher(Teacher teacher) {
        personList.add(teacher);
    }

    // Update person by ID
    public void updatePerson(String id, Person updatedPerson) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId().equals(id)) {
                personList.set(i, updatedPerson);
                break;
            }
        }
    }

    // Delete person by ID
    public void deletePersonById(String id) {
        personList.removeIf(person -> person.getId().equals(id));
    }

    // Find person by ID
    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    // Display all persons
    public void displayEveryone() {
        for (Person person : personList) {
            person.displayInfo();
        }
    }

    // Find the student with the highest GPA
    public Student findTopStudent() {
        Student topStudent = null;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (topStudent == null || student.getGpa() > topStudent.getGpa()) {
                    topStudent = student;
                }
            }
        }
        return topStudent;
    }

    // Find teacher by department
    public Teacher findTeacherByDepartment(String department) {
        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(department)) {
                    return teacher;
                }
            }
        }
        return null;
    }
}
