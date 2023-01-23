package Code;

import java.io.IOException;

public class EducationOfficer extends User{
    EducationOfficer(){}
    EducationOfficer(String username, String password){
        super(username, password);
        this.userType = "EducationOfficer";
    }
    EducationOfficer(String username, String password, int id){
        super(username, password, id);
        this.userType = "EducationOfficer";
    }
    public void saveToFile() throws IOException {
        super.saveToFile("education_officers.txt");
    }
    public void addTerm(){}
    public void addTeacher(String username, String password) throws IOException {
        Teacher tempTeacher = new Teacher(username, password);
        tempTeacher.saveToFile();
    }
    public void addStudent(String username, String password) throws IOException {
        Student tempStudent = new Student(username, password);
        tempStudent.saveToFile();
    }
    public void addCourse(String name, String syllabus, String reference, Date midExam, Date finalExam){}
    public void addExam(){}
}
