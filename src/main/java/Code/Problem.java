package Code;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

    public void saveToFile() throws IOException {
        File file = new File("src/main/java/Code/problems.txt");
        FileWriter problemWriter = new FileWriter(file, true);
        problemWriter.write(this.question+"|"+this.solution+"|"+this.id+"\n");
        problemWriter.close();
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
