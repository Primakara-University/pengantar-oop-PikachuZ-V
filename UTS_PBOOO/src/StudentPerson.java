public class StudentPerson extends Person {
    private String studentId;

    public StudentPerson(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public void introduce() {
        System.out.println("Halo, saya mahasiswa. Nama saya " + this.name +
                " dan NIM saya " + this.studentId + ".");
    }
}