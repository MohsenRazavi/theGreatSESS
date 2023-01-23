package Code;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Exam {
    Random rand = new Random();
    private String name;
    private Date examDate;
    private ArrayList<Problem> problems;
    private int id = rand.nextInt(100000);
    public Exam(){}
    public Exam(String name, ArrayList<Problem> problems){
    this.setName(name);
    this.setProblems(problems);
    }

    public void saveToFile() throws IOException {
        File examFile = new File("src/main/java/Code/exams.txt");
        FileWriter examWriter = new FileWriter(examFile, true);
        examWriter.write(this.id+"|"+this.name+"|"+this.examDate.getDay()+"|"+this.examDate.getMonth()+"|"+this.examDate.getYear()+"\n");
        for (Problem p: problems){
            examWriter.write(p.getId()+"|");
        }
        examWriter.write("\n");
        examWriter.write("\\/\n");

    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Problem> getProblems() {
        return problems;
    }

    public void setProblems(ArrayList<Problem> problems) {
        this.problems = problems;
    }
}
