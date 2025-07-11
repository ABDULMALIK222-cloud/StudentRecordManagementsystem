import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added!");
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public Student findStudentByRoll(int roll) {
        for (Student s : students) {
            if (s.getRollNumber() == roll) {
                return s;
            }
        }
        return null;
    }

    public void updateStudent(int roll, String name, String course, double marks) {
        Student s = findStudentByRoll(roll);
        if (s != null) {
            s.setName(name);
            s.setCourse(course);
            s.setMarks(marks);
            System.out.println("Updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(int roll) {
        Student s = findStudentByRoll(roll);
        if (s != null) {
            students.remove(s);
            System.out.println("Deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}
