import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class main extends Application {

    public Scene getLoginScene() {
        HBox usernameBox = new HBox();
        HBox passwordBox = new HBox();
        Label usernameLabel = new Label();
        Label passwordLabel = new Label();
        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button();
        VBox formBox = new VBox();
        MenuButton userTypeBox = new MenuButton();

        usernameLabel.setText("username :");
        passwordLabel.setText("password :");

//        usernameBox.getChildren().addAll(usernameLabel, usernameField);
        usernameBox.setSpacing(15);
        usernameBox.setAlignment(Pos.CENTER);

//        passwordBox.getChildren().addAll(passwordLabel, passwordField);
        passwordBox.setSpacing(15);
        passwordBox.setAlignment(Pos.CENTER);

        MenuItem educationOfficerItem = new MenuItem("Education Officer");
        MenuItem teacherItem = new MenuItem("Teacher");
        MenuItem studentItem = new MenuItem("Student");
//        userTypeBox.getItems().addAll(educationOfficerItem, teacherItem, studentItem);
        userTypeBox.setText("Login as");

        loginButton.setLabel("Login");

//        formBox.getChildren().addAll(usernameBox, passwordBox, userTypeBox, loginButton);

        Scene loginScene = new Scene(formBox, 400, 700);
        return loginScene;
    }

    public void getSignupScene(){
        HBox usernameBox = new HBox();
        HBox password1Box = new HBox();
        HBox password2Box = new HBox();
        VBox passwordBox = new VBox();
        Label usernameLabel = new Label();
        Label password1Label = new Label();
        Label password2Label = new Label();
        TextField usernameField = new TextField();
        PasswordField password1Field = new PasswordField();
        PasswordField password2Field = new PasswordField();
        Button loginButton = new Button();
        VBox formBox = new VBox();
        MenuButton userTypeBox = new MenuButton();

        usernameLabel.setText("username :");
        password1Label.setText("password :");
        password2Label.setText("repeat password :");

//        usernameBox.getChildren().addAll(usernameLabel, usernameField);
        usernameBox.setSpacing(15);
        usernameBox.setAlignment(Pos.CENTER);

//        password1Box.getChildren().addAll(password1Label, password1Field);
        password1Box.setSpacing(15);
        password1Box.setAlignment(Pos.CENTER);
//        password2Box.getChildren().addAll(password2Label, password2Field);
        password2Box.setSpacing(15);
        password2Box.setAlignment(Pos.CENTER);
        passwordBox.getChildren().addAll(password1Box, password2Box);

        userTypeBox.setText("Signup as");
        MenuItem educationOfficerItem = new MenuItem("Education Officer");
        MenuItem teacherItem = new MenuItem("Teacher");
        MenuItem studentItem = new MenuItem("Student");
//        userTypeBox.getItems().addAll(educationOfficerItem, teacherItem, studentItem);

        loginButton.setLabel("Signup");

//        formBox.getChildren().addAll(usernameBox, passwordBox, userTypeBox, loginButton);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setScene(getLoginScene());
        primaryStage.show();
    }
}
