// File: StudentPerson.java (Subclass)
public class StudentPerson extends Person {
    private String studentId;

    public StudentPerson(String name, String studentId) {
        super(name); // Memanggil constructor Person
        this.studentId = studentId;
    }

    @Override
    public void introduce() {
        System.out.println("Halo, saya mahasiswa. Nama saya " + this.name +
                " dan NIM saya " + this.studentId + ".");
    }
}