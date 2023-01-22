package Code;

public class Problem {
    private String question;
    private String solution;
    private String answer;
    private Exam exam;


    public Problem(){}
    public Problem(String question, String solution, String answer){
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
