public class MainApp {
    public static void main(String[] args) {

        System.out.println("--- SOAL 1 & 2: Class, Object, Encapsulation ---");

        Course oop = new Course("Object Oriented Programming", 3, "Bapak Azis Rahmad");
        Course web = new Course("Web Programming", 2, "Ibu Gung");

        System.out.println("Info: Mencoba mengubah SKS OOP menjadi -1...");
        oop.setCredit(-1);

        System.out.println("Info Object yang berhasil dibuat:");
        oop.displayInfo();
        web.displayInfo();

        System.out.println("\n--- SOAL 3: Relationship (Aggregation) ---");
        Student andi = new Student("Vanda Vicada", "2401020107");

        andi.addCourse(oop);
        andi.addCourse(web);
        andi.displayStudentInfo();


        System.out.println("\n--- SOAL 4: Inheritance & Polymorphism ---");
        Person[] people = new Person[3];
        people[0] = new StudentPerson("Citra", "23232323");
        people[1] = new Lecturer("Dr. Einstein", "D987");
        people[2] = new StudentPerson("Denis", "67890");

        for (Person p : people) {
            p.introduce();
        }


        System.out.println("\n--- SOAL 5: Abstract Class & Interface ---");

        Assessment examOOP = new Exam("OOP Exam", 88.0);
        Assessment assignmentWeb = new Assignment("PBO Assignment", 70.0, 80.0);

        System.out.println("Mata Ujian: " + examOOP.subject);
        System.out.println("Nilai Akhir: " + examOOP.calculateFinalScore());
        System.out.println("Grade: " + ((Gradable)examOOP).getGrade());

        System.out.println("\nMata Tugas: " + assignmentWeb.subject);
        System.out.println("Nilai Akhir: " + assignmentWeb.calculateFinalScore());
        System.out.println("Grade: " + ((Gradable)assignmentWeb).getGrade());
    }
}