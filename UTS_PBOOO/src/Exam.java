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
        double score = calculateFinalScore();
        if (score >= 85) return "A";
        if (score >= 75) return "B";
        if (score >= 65) return "C";
        return "D";
    }
}