// File: Student.java
import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    String studentId;
    // Agregasi: Student "has-a" list of Courses
    List<Course> enrolledCourses;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    // Method untuk menambah course
    public void addCourse(Course course) {
        this.enrolledCourses.add(course);
    }

    public void displayStudentInfo() {
        System.out.println("Mahasiswa: " + this.name + " (NIM: " + this.studentId + ")");
        System.out.println("  Daftar Mata Kuliah:");
        for (Course c : enrolledCourses) {
            c.displayInfo(); // Memanggil method dari object Course
        }
    }
}