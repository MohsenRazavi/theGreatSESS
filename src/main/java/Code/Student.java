package Code;

public class Student extends User{
    static String type = "Student";
    Student(){}
    Student(String username, String password){
        super(username, password);
    }
}
