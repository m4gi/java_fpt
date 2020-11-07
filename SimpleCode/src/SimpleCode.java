import java.util.ArrayList;
import java.util.stream.Collectors;

public class SimpleCode {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        HSTGUI gui = new HSTGUI();
        gui.setWelcomeMessage("STUDENT MANAGEMENT");
        gui.add("Create", SimpleCode::createStudent);
        gui.add("Find/Sort", SimpleCode::findSortStudent);
        gui.add("Update/Delete", SimpleCode::updateDeleteStudent);
        gui.add("Report", SimpleCode::reportStudents);
        gui.run();
    }

    private static void createStudent() {
        do {
            students.add(Student.newStudent());
        } while (HSTINPUT.doYouWantContinue());
    }

    private static void findSortStudent() {
        String name = HSTINPUT.nextString("Enter name to search: ");
        ArrayList<Student> list = (ArrayList<Student>) students.stream().filter(s -> s.name.contains(name)).sorted().collect(Collectors.toList());
        if (list.size() > 0) {
            System.out.printf("All students contains \"%s\": \n", name);
            list.forEach(Student::showInfo);
        } else System.out.println("Student not exist.");
    }

    private static void updateDeleteStudent() {
        String id = HSTINPUT.nextString("Enter ID to search: ");
        Student student = students.stream().filter(s -> s.id.equals(id)).findFirst().orElse(null);
        if (student != null) {
            if (HSTINPUT.doYouWantContinue("Do you want to update (U) or delete (D) student: ", "U", "D")) {
                student.update();
            } else students.remove(student);
        } else System.out.println("Student not exist.");
    }

    private static void reportStudents() {
        System.out.println("All students information: ");
        students.forEach(Student::showInfo);
    }
}

class Student implements Comparable<Student> {
    String id;
    String name;
    String semester;
    String course;

    Student(String id, String name, String semester, String course) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.course = course;
    }

    void showInfo() {
        System.out.printf("%s \t| %s \t| %s \t| %s\n", id, name, course, semester);
    }

    static Student newStudent() {
        String id = HSTINPUT.nextString("Input student id: ");
        String name = HSTINPUT.nextString("Input student name: ");
        String semester = HSTINPUT.nextString("Input student semester: ");
        String course = HSTINPUT.nextString("Input student course: ");
        return new Student(id, name, semester, course);
    }

    void update() {
        id = HSTINPUT.nextString("Input student id: ");
        name = HSTINPUT.nextString("Input student name: ");
        semester = HSTINPUT.nextString("Input student semester: ");
        course = HSTINPUT.nextString("Input student course: ");
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}