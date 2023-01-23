package Code;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Course {
    Random rand = new Random();

    private String name;
    private int id = rand.nextInt(100000);
    private String syllabus;
    private String reference;
    private Date midExamDate;
    private Date finalExamDate;
    private Teacher teacher;
    private ArrayList<Student> students;

    public Course() {
    }

    public Course(String name, String syllabus, String reference, Date midExamDate, Date finalExamDate) {
        this.setName(name);
        this.setSyllabus(syllabus);
        this.setReference(reference);
        this.setMidExamDate(midExamDate);
        this.setFinalExamDate(finalExamDate);
    }

    public void saveToFile() throws IOException {
        File file = new File("courses.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(this.id+"|"+this.name+"|"+this.reference+"|"+this.syllabus+"|"+this.midExamDate.getDay()+"|"+this.midExamDate.getMonth()+"|"+this.midExamDate.getYear()+"|"+this.finalExamDate.getDay()+"|"+this.finalExamDate.getMonth()+"|"+this.finalExamDate.getYear()+"|"+this.teacher.getId()+"\n");
        for (Student s: students){
            fileWriter.write(s.getId()+"|");
        }
        fileWriter.write("\n");
        fileWriter.write("\\/\n");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getMidExamDate() {
        return midExamDate;
    }

    public void setMidExamDate(Date midExamDate) {
        this.midExamDate = midExamDate;
    }

    public Date getFinalExamDate() {
        return finalExamDate;
    }

    public void setFinalExamDate(Date finalExamDate) {
        this.finalExamDate = finalExamDate;
    }
}
