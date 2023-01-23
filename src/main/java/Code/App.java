package Code;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();

    static Authentication auth = new Authentication();
    public static void update() {
        try {
            File teacherFile = new File("src/main/java/Code/teachers.txt");
            Scanner teacherReader = new Scanner(teacherFile);
            while (teacherReader.hasNextLine()) {
                String[] tempData = (teacherReader.nextLine()).split("\\|");
                Teacher tempTeacher = new Teacher(tempData[0], tempData[1], Integer.valueOf(tempData[2]));
                teachers.add(tempTeacher);
            }

            File studentFile = new File("src/main/java/Code/students.txt");
            Scanner studentReader = new Scanner(studentFile);
            while (studentReader.hasNextLine()) {
                String[] tempData = (studentReader.nextLine()).split("\\|");
                Student tempStudent = new Student(tempData[0], tempData[1], Integer.valueOf(tempData[2]));
                students.add(tempStudent);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
