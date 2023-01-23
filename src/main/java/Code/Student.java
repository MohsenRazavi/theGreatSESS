package Code;

import java.io.IOException;
import java.util.ArrayList;

public class Student extends User{
    private Term activeTerm;
    private ArrayList<Course> courses;
    static String type = "Student";
    Student(){}
    Student(String username, String password){
        super(username, password);
        this.userType = "Student";
    }
    Student(String username, String password, int id){
        super(username, password, id);
        this.userType = "Student";
    }
    public void saveToFile() throws IOException {
        super.saveToFile("students.txt");
    }

    public Term getActiveTerm() {
        return activeTerm;
    }

    public void setActiveTerm(Term activeTerm) {
        this.activeTerm = activeTerm;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Student.type = type;
    }
}
