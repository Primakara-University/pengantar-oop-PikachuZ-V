// File: MainApp.java
public class MainApp {
    public static void main(String[] args) {

        System.out.println("--- SOAL 1 & 2: Class, Object, Encapsulation ---");
        // Membuat object Course
        Course oop = new Course("Object Oriented Programming", 3, "Budi Santoso");
        Course web = new Course("Web Programming", 2, "Siti Aminah");

        // Coba set credit dengan nilai negatif (validasi akan jalan)
        oop.setCredit(-1);

        oop.displayInfo();
        web.displayInfo();

        System.out.println("\n--- SOAL 3: Relationship (Aggregation) ---");
        // Membuat object Student
        Student andi = new Student("Andi", "12345");
        // Menambahkan course ke student
        andi.addCourse(oop);
        andi.addCourse(web);
        andi.displayStudentInfo();

        System.out.println("\n--- SOAL 4: Inheritance & Polymorphism ---");
        // Membuat array tipe Person (Polymorphism)
        Person[] people = new Person[3];
        people[0] = new StudentPerson("Citra", "54321"); // Dianggap Person
        people[1] = new Lecturer("Dr. Ratna", "D987");    // Dianggap Person
        people[2] = new StudentPerson("Doni", "67890");  // Dianggap Person

        // Loop dan panggil method introduce()
        for (Person p : people) {
            p.introduce(); // Akan memanggil method override yang sesuai
        }

        System.out.println("\n--- SOAL 5: Abstract Class & Interface ---");
        // Membuat object Exam (tipe Gradable)
        Gradable exam = new Exam("Matematika", 90);
        Gradable assignment = new Assignment("Fisika", 75);

        System.out.println("Nilai Ujian Matematika: " + ((Assessment)exam).calculateFinalScore() +
                ", Grade: " + exam.getGrade());
        System.out.println("Nilai Tugas Fisika: " + ((Assessment)assignment).calculateFinalScore() +
                ", Grade: " + assignment.getGrade());
    }
}