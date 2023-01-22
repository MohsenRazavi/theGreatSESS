package Code;

import java.util.ArrayList;

public class Term {
    private String name;
    private Date submitScoresDate;
    private Date startDate;
    private Date endDate;
    private ArrayList<Course> courses;
    private ArrayList<Teacher>teachers;
    private ArrayList<Student>students;

    public Term() {
    }

    public Term(String name, Date submitScoresDate, Date startDate, Date endDate) {
        this.setName(name);
        this.setSubmitScoresDate(submitScoresDate);
        this.setStartDate(startDate);
        this.setEndDate(endDate);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
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

    public Date getSubmitScoresDate() {
        return submitScoresDate;
    }

    public void setSubmitScoresDate(Date submitScoresDate) {
        this.submitScoresDate = submitScoresDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
