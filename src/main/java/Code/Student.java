package Code;

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
