package Code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Authentication {
    File file;
    Scanner reader;
    public User login(String username, String password, String userType) throws FileNotFoundException {
        String fileName = null;
        if (userType.equals("Teacher"))
            fileName = "teachers.txt";
        else if (userType.equals("Student"))
            fileName = "students.txt";
        else if (userType.equals("EducationOfficer"))
            fileName = "education_officers.txt";
        file = new File(fileName);
        reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String[] data = (reader.nextLine()).split("|");
            if (username.equals(data[0])) {
                if (password.equals(data[1])) {
                    if (userType.equals("Teacher"))
                        return new Teacher(username, password);
                    else if (userType.equals("Student"))
                        return new Student(username, password);
                    else if (userType.equals("EducationOfficer"))
                        return new EducationOfficer(username, password);
                }
                return new User("wrong password", "wrong password");
            }
        }
        return new User("not found", "not found");
    }

    public User signup(String username, String password, String userType) throws IOException {
        if (userType.equals("Teacher")) {
            Teacher newUser = new Teacher(username, password);
            newUser.saveToFile("teachers.txt");
            return newUser;
        } else if (userType.equals("Student")) {
            Student newUser = new Student(username, password);
            newUser.saveToFile("students.txt");
            return newUser;
        } else if (userType.equals("EducationOfficer")) {
            EducationOfficer newUser = new EducationOfficer(username, password);
            newUser.saveToFile("education_officer.txt");
            return newUser;
        } else {
            return new User();
        }
    }
}
