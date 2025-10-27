public class Assignment extends Assessment implements Gradable {

    private double scorePart1;
    private double scorePart2;

    public Assignment(String subject, double scorePart1, double scorePart2) {
        super(subject);
        this.scorePart1 = scorePart1;
        this.scorePart2 = scorePart2;
    }

    @Override
    public double calculateFinalScore() {
        return (this.scorePart1 + this.scorePart2) / 2.0;
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