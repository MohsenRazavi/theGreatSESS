package Code;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class App {
    Authentication auth = new Authentication();
    public void Login() {
        HBox usernameBox = new HBox();
        HBox passwordBox = new HBox();
        Label usernameLabel = new Label();
        Label passwordLabel = new Label();
        Label typeLabel = new Label();
        Label sessLabel = new Label();
        TextField usernameField = new TextField();
        TextField typeField = new TextField();
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button();
        VBox formBox = new VBox();
        MenuButton userTypeBox = new MenuButton();

        usernameLabel.setText("username :");
        passwordLabel.setText("password :");
        sessLabel.setText("The Great SESS");
        sessLabel.setFont(Font.font(35));

        usernameBox.getChildren().addAll(usernameLabel, usernameField);
        usernameBox.setSpacing(15);
        usernameBox.setAlignment(Pos.CENTER);

        passwordBox.getChildren().addAll(passwordLabel, passwordField);
        passwordBox.setSpacing(15);
        passwordBox.setAlignment(Pos.CENTER);

        userTypeBox.setText("Login as ");
        MenuItem educationOfficerItem = new MenuItem("Education Officer");
        MenuItem teacherItem = new MenuItem("Teacher");
        MenuItem studentItem = new MenuItem("Student");
        userTypeBox.getItems().addAll(educationOfficerItem, teacherItem, studentItem);
        userTypeBox.setAlignment(Pos.CENTER);

        loginButton.setText("Login");
        loginButton.setAlignment(Pos.CENTER);

        formBox.getChildren().addAll(sessLabel, usernameBox, passwordBox, userTypeBox, loginButton);
        formBox.setAlignment(Pos.CENTER);
        formBox.setSpacing(20);

        loginButton.setOnAction(value -> {
            try {
                    User u = auth.login(usernameField.getText(), passwordField.getText(), typeField.getText());
            } catch (FileNotFoundException e) {
            }
        });

        Scene loginScene = new Scene(formBox, 400, 700);
        Stage loginStage = new Stage();
        loginStage.setScene(loginScene);
        loginStage.show();
    }

    public void AddUser() {
        HBox usernameBox = new HBox();
        HBox password1Box = new HBox();
        HBox password2Box = new HBox();
        VBox passwordBox = new VBox();
        Label usernameLabel = new Label();
        Label password1Label = new Label();
        Label password2Label = new Label();
        Label sessLabel = new Label();
        TextField usernameField = new TextField();
        PasswordField password1Field = new PasswordField();
        PasswordField password2Field = new PasswordField();
        Button loginButton = new Button();
        VBox formBox = new VBox();
        MenuButton userTypeBox = new MenuButton();

        usernameLabel.setText("username :");
        password1Label.setText("password :");
        password2Label.setText("repeat password :");
        sessLabel.setText("The Great SESS");
        sessLabel.setFont(Font.font(35));


        usernameBox.getChildren().addAll(usernameLabel, usernameField);
        usernameBox.setSpacing(15);
        usernameBox.setAlignment(Pos.CENTER);

        password1Box.getChildren().addAll(password1Label, password1Field);
        password1Box.setSpacing(15);
        password1Box.setAlignment(Pos.CENTER);
        password2Box.getChildren().addAll(password2Label, password2Field);
        password2Box.setSpacing(15);
        password2Box.setAlignment(Pos.CENTER);
        passwordBox.getChildren().addAll(password1Box, password2Box);
        passwordBox.setSpacing(15);

        userTypeBox.setText("Add ..");
        MenuItem educationOfficerItem = new MenuItem("Education Officer");
        MenuItem teacherItem = new MenuItem("Teacher");
        MenuItem studentItem = new MenuItem("Student");
        userTypeBox.getItems().addAll(educationOfficerItem, teacherItem, studentItem);
        userTypeBox.setAlignment(Pos.CENTER);

        loginButton.setText("Signup");
        loginButton.setAlignment(Pos.CENTER);

        formBox.getChildren().addAll(sessLabel, usernameBox, passwordBox, userTypeBox, loginButton);
        formBox.setAlignment(Pos.CENTER);
        formBox.setSpacing(20);
        Scene signupScene = new Scene(formBox, 400, 700);
        Stage signupStage = new Stage();
        signupStage.setScene(signupScene);
        signupStage.show();
    }

}
