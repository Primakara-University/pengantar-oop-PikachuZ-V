// File: Assessment.java (Abstract Class)
public abstract class Assessment {
    protected String subject;

    public Assessment(String subject) { this.subject = subject; }

    // Abstract method (wajib di-override)
    public abstract double calculateFinalScore();
}