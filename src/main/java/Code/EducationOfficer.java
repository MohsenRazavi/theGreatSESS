package Code;

public class EducationOfficer extends User{
    EducationOfficer(){}
    EducationOfficer(String username, String password){
        super(username, password);
        this.userType = "EducationOfficer";
    }
    public void addTerm(){}
    public void addTeacher(){}
    public void addStudent(){}
    public void addCourse(){}
    public void addExam(){}
}
