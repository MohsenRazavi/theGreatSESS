package Code;

public class Teacher extends User{
    private Course course;
    private Term activeTerm;
    static String type = "Teacher";
    Teacher(){}
    Teacher(String username, String password){
        super(username, password);
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Term getActiveTerm() {
        return activeTerm;
    }

    public void setActiveTerm(Term activeTerm) {
        this.activeTerm = activeTerm;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Teacher.type = type;
    }
}
