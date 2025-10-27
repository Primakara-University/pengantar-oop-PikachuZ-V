// File: Course.java
public class Course {
    // Atribut dibuat private (Encapsulation)
    private String courseName;
    private int credit;
    private String instructorName;

    // Constructor
    public Course(String courseName, int credit, String instructorName) {
        this.courseName = courseName;
        this.setCredit(credit); // Gunakan setter untuk validasi
        this.instructorName = instructorName;
    }

    // --- Getter Methods ---
    public String getCourseName() { return this.courseName; }
    public int getCredit() { return this.credit; }
    public String getInstructorName() { return this.instructorName; }

    // --- Setter Method dengan Validasi ---
    public void setCredit(int credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Error: Credit harus positif. Nilai diabaikan.");
        }
    }

    public void displayInfo() {
        System.out.println("  - Matkul: " + this.courseName +
                " (" + this.credit + " SKS) - Dosen: " + this.instructorName);
    }
}