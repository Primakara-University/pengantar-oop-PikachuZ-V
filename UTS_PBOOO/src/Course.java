public class Course {
    private String courseName;
    private int credit;
    private String instructorName;

    public Course(String courseName, int credit, String instructorName) {
        this.courseName = courseName;
        this.setCredit(credit);
        this.instructorName = instructorName;
    }

    public void displayInfo() {
        System.out.println("  - Matkul: " + this.courseName +
                " (" + this.credit + " SKS) - Dosen: " + this.instructorName);
    }

    public String getCourseName() {
        return this.courseName;
    }

    public int getCredit() {
        return this.credit;
    }

    public String getInstructorName() {
        return this.instructorName;
    }

    public void setCredit(int credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Error: Credit untuk '" + this.courseName + "' harus positif. Nilai tidak diubah.");
        }
    }
}