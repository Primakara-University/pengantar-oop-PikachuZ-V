 abstract class Assessment {
    protected String subject;

    public Assessment(String subject) {
        this.subject = subject;
    }

    public abstract double calculateFinalScore();

    public void showSubject() {
        System.out.println("Ini adalah penilaian untuk: " + this.subject);
    }
}