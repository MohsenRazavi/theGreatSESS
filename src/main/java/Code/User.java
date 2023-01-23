package Code;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class User {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    private static int[] ids;
    private int id;
    private String username;
    private String password;
    static protected String userType = null;

    public User() {
    }

    public User(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
        this.setId(_findId());
    }
    public User(String username, String password, int id) {
        this.setUsername(username);
        this.setPassword(password);
        this.setId(id);
    }

    public int _findId() {
        int tempId = rand.nextInt(1000);
        boolean c = true;
        boolean isOk = true;
        while (c) {
            for (int id : ids) {
                if (tempId == id) {
                    tempId = rand.nextInt(1000);
                    isOk = false;
                    break;
                }
            }
            if (isOk) {
                c = false;
            }
        }
        return tempId;
    }

    public void saveToFile(String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter("src/main/java/Code/"+fileName, true);
        FileWriter userWriter = new FileWriter("src/main/java/Code/"+"users.txt", true);
        fileWriter.write(this.username+"|"+this.password);
        userWriter.write(this.username+"|"+this.password+"|"+this.userType+"|"+this.id);
        userWriter.close();
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getUserType() {
        return userType;
    }

    public static void setUserType(String userType) {
        User.userType = userType;
    }

}
