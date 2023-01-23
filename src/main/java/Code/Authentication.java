package Code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Authentication {
    File file;
    Scanner reader;

    public User login(String username, String password, String userType) throws FileNotFoundException {
        String fileName = "src/main/java/Code/users.txt";
        if (userType.equals("Teacher"))
            fileName = "src/main/java/Code/teachers.txt";
        else if (userType.equals("Student"))
            fileName = "src/main/java/Code/students.txt";
        else if (userType.equals("Education Officer"))
            fileName = "src/main/java/Code/education_officers.txt";
        File file = new File(fileName);
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String[] data = (reader.nextLine()).split("\\|");
            if (username.equals(data[0])) {
                if (password.equals(data[1])) {
                    System.out.println("Login successful");
                    if (userType.equals("Teacher"))
                        return new Teacher(username, password);
                    else if (userType.equals("Student"))
                        return new Student(username, password);
                    else if (userType.equals("EO"))
                        return new EducationOfficer(username, password);
                }
                return new User("wrong password", "wrong password");
            }
        }
        return new User("not found", "not found");
    }

    public User signup(String username, String password1, String password2, String userType) throws IOException {
        File userFile = new File("src/main/java/Code/users.txt");
        Scanner userScanner = new Scanner(userFile);
        boolean isOk = true;
        while (userScanner.hasNextLine()) {
            String[] tempData = (userScanner.nextLine()).split("\\|");
            if (username.equals(tempData[0])) {
                isOk = false;
            }
        }
        if (!password1.equals(password2)) {
            isOk = false;
            return new User("password not match", "password not match");
        }
        if (isOk) {
            if (userType.equals("Teacher")) {
                Teacher newTeacher = new Teacher(username, password1);
                newTeacher.saveToFile("teachers.txt");
                return newTeacher;
            } else if (userType.equals("Student")) {
                Student newStudent = new Student(username, password1);
                newStudent.saveToFile("students.txt");
                return newStudent;
            } else if (userType.equals("Education Officer")) {
                EducationOfficer newEducationOfficer = new EducationOfficer(username, password1);
                newEducationOfficer.saveToFile("education_officers.txt");
                return newEducationOfficer;
            } else {
                return new User();
            }
        }
        return new User("user exists", "user exists");
    }
}
