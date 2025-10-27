public class Lecturer extends Person {
    private String employeeId;

    public Lecturer(String name, String employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    @Override
    public void introduce() {
        System.out.println("Selamat pagi, saya dosen. Nama saya " + this.name +
                " (NIDN: " + this.employeeId + ").");
    }
}