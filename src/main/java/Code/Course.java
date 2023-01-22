package Code;

import java.util.ArrayList;

public class Course {
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

    private String name;
    private String syllabus;
    private String reference;
    private Date midExamDate;
    private Date finalExamDate;
    private Teacher teacher;
    private ArrayList<Student> students;
    public Course(){}
    public Course(String name, String syllabus, String reference, Date midExamDate, Date finalExamDate){
        this.setName(name);
        this.setSyllabus(syllabus);
        this.setReference(reference);
        this.setMidExamDate(midExamDate);
        this.setFinalExamDate(finalExamDate);
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
