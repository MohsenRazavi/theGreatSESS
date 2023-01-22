package Code;

import java.util.ArrayList;

public class Exam {
    private String name;
    private ArrayList<Problem> problems;
    public Exam(){}
    public Exam(String name, ArrayList<Problem> problems){
    this.setName(name);
    this.setProblems(problems);
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
