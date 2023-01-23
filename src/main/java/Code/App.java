package Code;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();

    static Authentication auth = new Authentication();

    public static void update() {
        try {
            File userFile = new File("src/main/java/Code/users.txt");
            Scanner userReader = new Scanner(userFile);
            while (userReader.hasNextLine()) {
                String[] tempData = (userReader.nextLine()).split("\\|");
                User tempUser = new User(tempData[0], tempData[1], Integer.parseInt(tempData[2]));
                users.add(tempUser);
            }

                File teacherFile = new File("src/main/java/Code/teachers.txt");
                Scanner teacherReader = new Scanner(teacherFile);
                while (teacherReader.hasNextLine()) {
                    String[] tempData = (teacherReader.nextLine()).split("\\|");
                    Teacher tempTeacher = new Teacher(tempData[0], tempData[1], Integer.parseInt(tempData[2]));
                    teachers.add(tempTeacher);
                }

                File studentFile = new File("src/main/java/Code/students.txt");
                Scanner studentReader = new Scanner(studentFile);
                while (studentReader.hasNextLine()) {
                    String[] tempData = (studentReader.nextLine()).split("\\|");
                    Student tempStudent = new Student(tempData[0], tempData[1], Integer.parseInt(tempData[2]));
                    students.add(tempStudent);
                }

                File courseFile = new File("src/main/java/Code/courses.txt");
                Scanner courseReader = new Scanner(courseFile);
                while (courseReader.hasNextLine()) {
                    String[] tempData = (courseReader.nextLine()).split("\\|");
                    Date midDate = new Date(Integer.parseInt(tempData[4]), Integer.parseInt(tempData[5]), Integer.parseInt(tempData[6]));
                    Date finalDate = new Date(Integer.parseInt(tempData[7]), Integer.parseInt(tempData[8]), Integer.parseInt(tempData[9]));
                    Course tempCourse = new Course(Integer.parseInt(tempData[0]), tempData[1], tempData[2], tempData[3], midDate, finalDate);
                    for (Teacher t : App.teachers) {
                        if (t.getId() == Integer.parseInt(tempData[10])) {
                            tempCourse.setTeacher(t);
                            break;
                        }
                    }
                    App.courses.add(tempCourse);
                }

            } catch (Exception e) {
                System.out.println(e);
            }

    }
}
