// File: Exam.java (Subclass + Interface)
public class Exam extends Assessment implements Gradable {
    private double score;

    public Exam(String subject, double score) {
        super(subject);
        this.score = score;
    }

    @Override
    public double calculateFinalScore() {
        return this.score;
    }

    @Override
    public String getGrade() {
        if (this.score > 85) return "A";
        if (this.score > 70) return "B";
        return "C";
    }
}