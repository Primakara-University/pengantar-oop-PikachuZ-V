public class Person {
    protected String name; // protected agar bisa diakses subclass

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Halo, nama saya " + this.name + ".");
    }
}