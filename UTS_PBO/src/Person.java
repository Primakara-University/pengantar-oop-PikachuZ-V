// File: Person.java (Superclass)
public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Halo, nama saya " + this.name + ".");
    }
}