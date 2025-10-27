import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    String studentId;
    List<Course> enrolledCourses;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        this.enrolledCourses.add(course);
        System.out.println("Info: " + course.getCourseName() + " ditambahkan ke " + this.name);
    }

    public void displayStudentInfo() {
        System.out.println("\n===== Info Mahasiswa =====");
        System.out.println("Nama    : " + this.name);
        System.out.println("NIM     : " + this.studentId);
        System.out.println("Daftar Mata Kuliah:");

        if (enrolledCourses.isEmpty()) {
            System.out.println("  (Belum mengambil mata kuliah)");
        } else {
            for (Course c : enrolledCourses) {
                c.displayInfo();
            }
        }
        System.out.println("==========================");
    }
}