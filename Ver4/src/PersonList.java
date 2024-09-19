import java.util.ArrayList;

public class PersonList {
    private final ArrayList<Person> personList;

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        personList.add(student);
    }

    public void addTeacher(Teacher teacher) {
        personList.add(teacher);
    }

    public void updatePerson(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                person.updatePerson(id);
            }
        }
    }

    public void deletePersonById(String id) {
        personList.removeIf(person -> person.getId().equals(id));
    }

    public void displayEveryone() {
        for (Person person : personList) {
            person.displayInfo();
        }
    }

    public Student findTopStudent() {
        Student topStudent = null;
        float highestGpa = 0.0f;
        for (Person person : personList) {
            if (person instanceof Student student) {
                if (student.getGpa() > highestGpa) {
                    highestGpa = student.getGpa();
                    topStudent = student;
                }
            }
        }
        return topStudent;
    }

    public ArrayList<Teacher> findTeacherByDepartment(String department) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        for (Person person : personList) {
            if (person instanceof Teacher teacher) {
                if (teacher.getDepartment().equals(department)) {
                    teachers.add(teacher);
                }
            }
        }
        return teachers;
    }
}
