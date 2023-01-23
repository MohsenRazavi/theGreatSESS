package Code;

import java.util.Random;

public class Problem {
    Random rand = new Random();
    private String question;
    private String solution;
    private String answer;
    private Exam exam;
    private int id = rand.nextInt(100000);

    public Problem() {
    }

    public Problem(String question, String solution, String answer) {
        this.setQuestion(question);
        this.setAnswer(answer);
        this.setAnswer(answer);
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
