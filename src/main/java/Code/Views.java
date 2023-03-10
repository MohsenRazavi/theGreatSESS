package Code;


import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Views {

    public void Login() {
        HBox usernameBox = new HBox();
        HBox passwordBox = new HBox();
        HBox typeBox = new HBox();
        Label usernameLabel = new Label();
        Label passwordLabel = new Label();
        Label typeLabel = new Label();
        Label sessLabel = new Label();
        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button();
        VBox formBox = new VBox();
        MenuButton userTypeBox = new MenuButton();

        usernameLabel.setText("username :");
        passwordLabel.setText("password :");
        sessLabel.setText("Login To The Great SESS");
        sessLabel.setFont(Font.font(35));

        usernameBox.getChildren().addAll(usernameLabel, usernameField);
        usernameBox.setSpacing(15);
        usernameBox.setAlignment(Pos.CENTER);

        passwordBox.getChildren().addAll(passwordLabel, passwordField);
        passwordBox.setSpacing(15);
        passwordBox.setAlignment(Pos.CENTER);

        typeLabel.setText("Login as");
        MenuItem teacherItem = new MenuItem("Teacher");
        MenuItem studentItem = new MenuItem("Student");
        teacherItem.setOnAction(event -> {
            userTypeBox.setText(teacherItem.getText());
        });
        studentItem.setOnAction(event -> {
            userTypeBox.setText(studentItem.getText());
        });
        userTypeBox.getItems().addAll(teacherItem, studentItem);
        userTypeBox.setAlignment(Pos.CENTER);
        typeBox.getChildren().addAll(typeLabel, userTypeBox);
        typeBox.setSpacing(15);
        typeBox.setAlignment(Pos.CENTER);


        loginButton.setText("Login");
        loginButton.setAlignment(Pos.CENTER);

        formBox.getChildren().addAll(sessLabel, usernameBox, passwordBox, typeBox, loginButton);
        formBox.setAlignment(Pos.CENTER);
        formBox.setSpacing(20);

        loginButton.setOnAction(event -> {
            try {
                User u = App.auth.login(usernameField.getText(), passwordField.getText(), userTypeBox.getText());
            } catch (FileNotFoundException e) {
            }
        });

        Scene loginScene = new Scene(formBox, 1200, 700);
        Stage loginStage = new Stage();
        loginStage.setScene(loginScene);
        loginStage.show();
    }


    public static class EducationOfficerView {
        public static void AddUser() {
            HBox usernameBox = new HBox();
            HBox password1Box = new HBox();
            HBox password2Box = new HBox();
            HBox typeBox = new HBox();
            VBox passwordBox = new VBox();
            Label usernameLabel = new Label();
            Label typeLabel = new Label();
            Label password1Label = new Label();
            Label password2Label = new Label();
            Label titleLabel = new Label();
            Label messageLabel = new Label();
            TextField usernameField = new TextField();
            PasswordField password1Field = new PasswordField();
            PasswordField password2Field = new PasswordField();
            Button signupButton = new Button();
            VBox formBox = new VBox();
            MenuButton userTypeBox = new MenuButton();

            usernameLabel.setText("username :");
            password1Label.setText("password :");
            password2Label.setText("repeat password :");
            typeLabel.setText("user type :");
            titleLabel.setText("Add New User");
            titleLabel.setFont(Font.font(35));
            messageLabel.setTextFill(Color.rgb(255, 0, 0));
            messageLabel.setAlignment(Pos.CENTER);


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


            MenuItem teacherItem = new MenuItem("Teacher");
            MenuItem studentItem = new MenuItem("Student");
            teacherItem.setOnAction(event -> {
                userTypeBox.setText(teacherItem.getText());
            });
            studentItem.setOnAction(event -> {
                userTypeBox.setText(studentItem.getText());
            });
            userTypeBox.getItems().addAll(teacherItem, studentItem);
            userTypeBox.setAlignment(Pos.CENTER);
            typeBox.getChildren().addAll(typeLabel, userTypeBox);
            typeBox.setAlignment(Pos.CENTER);
            typeBox.setSpacing(15);

            signupButton.setText("Add");
            signupButton.setAlignment(Pos.CENTER);
            signupButton.setOnAction(event -> {
                App.update();
                try {
                    User u = App.auth.signup(usernameField.getText(), password1Field.getText(), password2Field.getText(), userTypeBox.getText());
                    if (u.getUsername().equals("password not match") && u.getPassword().equals("password not match")){
                        messageLabel.setTextFill(Color.rgb(255, 0, 0));
                        messageLabel.setText("Passwords not match.");
                    }
                    else if (u.getUsername().equals("user exists") && u.getPassword().equals("user exists")){
                        messageLabel.setTextFill(Color.rgb(255, 0, 0));
                        messageLabel.setText("User with this username exists.");
                    }else{
                        messageLabel.setText("Successful !");
                        messageLabel.setTextFill(Color.rgb(0, 255, 0));
                    }

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            });

            formBox.getChildren().addAll(titleLabel, usernameBox, passwordBox, typeBox, signupButton, messageLabel);
            formBox.setAlignment(Pos.CENTER);
            formBox.setSpacing(20);
            Scene signupScene = new Scene(formBox, 1200, 700);
            Stage signupStage = new Stage();
            signupStage.setScene(signupScene);
            signupStage.show();
        }

        public static void addCourse() throws FileNotFoundException {
            Label titleLabel = new Label("Add New Course");
            Label courseNameLabel = new Label("name :");
            Label syllabusLabel = new Label("syllabus :");
            Label referenceLabel = new Label("reference :");
            Label midExamDateLabel = new Label("midterm exam date :");
            Label finalExamDateLabel = new Label("final exam date :");
            Label teacherLabel = new Label("teacher :");


            TextField courseNameTextField = new TextField();
            TextArea syllabusTextArea = new TextArea();
            TextField referenceTextField = new TextField();
            DatePicker midExamDatePicker = new DatePicker();
            DatePicker finalExamDatePicker = new DatePicker();
            MenuButton teacherMenu = new MenuButton();

            Button saveButton = new Button("Save");

            HBox courseNameHBox = new HBox();
            HBox syllabusHBox = new HBox();
            HBox referenceHBox = new HBox();
            HBox midExamDateHBox = new HBox();
            HBox finalExamDateHBox = new HBox();
            HBox teacherHBox = new HBox();
            VBox totalBox = new VBox();

            titleLabel.setFont(Font.font(35));

            courseNameHBox.getChildren().addAll(courseNameLabel, courseNameTextField);
            courseNameHBox.setAlignment(Pos.CENTER);
            courseNameHBox.setSpacing(15);

            syllabusHBox.getChildren().addAll(syllabusLabel, syllabusTextArea);
            syllabusHBox.setAlignment(Pos.CENTER);
            syllabusHBox.setSpacing(15);

            referenceHBox.getChildren().addAll(referenceLabel, referenceTextField);
            referenceHBox.setAlignment(Pos.CENTER);
            referenceHBox.setSpacing(15);

            midExamDateHBox.getChildren().addAll(midExamDateLabel, midExamDatePicker);
            midExamDateHBox.setAlignment(Pos.CENTER);
            midExamDateHBox.setSpacing(15);

            finalExamDateHBox.getChildren().addAll(finalExamDateLabel, finalExamDatePicker);
            finalExamDateHBox.setAlignment(Pos.CENTER);
            finalExamDateHBox.setSpacing(15);

            App.update();
            for (Teacher t : App.teachers) {
                MenuItem tItem = new MenuItem(t.getUsername());
                teacherMenu.getItems().add(tItem);
                tItem.setOnAction(event -> {
                    teacherMenu.setText(tItem.getText());
                });
            }
            teacherHBox.getChildren().addAll(teacherLabel, teacherMenu);
            teacherHBox.setSpacing(15);
            teacherHBox.setAlignment(Pos.CENTER);

            saveButton.setAlignment(Pos.CENTER);
            saveButton.setOnAction(event -> {
                Date midDate = new Date(midExamDatePicker.getValue().getDayOfMonth(), midExamDatePicker.getValue().getMonthValue(), midExamDatePicker.getValue().getYear());
                Date finaleDate = new Date(finalExamDatePicker.getValue().getDayOfMonth(), finalExamDatePicker.getValue().getMonthValue(), finalExamDatePicker.getValue().getYear());
                Course tempCourse = new Course(courseNameTextField.getText(), syllabusTextArea.getText(), referenceTextField.getText(), midDate, finaleDate);
                for (Teacher t:App.teachers){
                    if(Objects.equals(t.getUsername(), teacherMenu.getText())){
                        t.setCourse(tempCourse);
                        tempCourse.setTeacher(t);
                    }
                }
                try {
                    tempCourse.saveToFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                App.courses.add(tempCourse);
            });

            totalBox.getChildren().addAll(titleLabel, courseNameHBox, teacherHBox, referenceHBox, syllabusHBox, midExamDateHBox, finalExamDateHBox, saveButton);
            totalBox.setAlignment(Pos.CENTER);
            totalBox.setSpacing(20);

            Scene addCourseScene = new Scene(totalBox, 1200, 700);

            Stage addCourseStage = new Stage();
            addCourseStage.setScene(addCourseScene);
            addCourseStage.show();
        }
    static public void addTerm(){
        Label titleLabel = new Label("Add new Term");
        Label nameLabel = new Label("name :");
        Label startDateLabel = new Label("Date of start term :");
        Label endDateLabel = new Label("Date of end term :");
        Label submitScoresDateLabel = new Label(("Date of submitting scores :"));
        Label message = new Label();

        Button addButton = new Button("Add");

        TextField nameTextField = new TextField();

        DatePicker startDatePicker = new DatePicker();
        DatePicker endDatePicker = new DatePicker();
        DatePicker submitScoresDatePicker = new DatePicker();

        HBox nameBox = new HBox();
        HBox startDateBox = new HBox();
        HBox endDateBox = new HBox();
        HBox submitScoresBox = new HBox();
        VBox total = new VBox();

        titleLabel.setFont(Font.font(35));

        nameLabel.setAlignment(Pos.CENTER);
        nameBox.getChildren().addAll(nameLabel, nameTextField);
        nameBox.setSpacing(15);
        nameBox.setAlignment(Pos.CENTER);

        startDateLabel.setAlignment(Pos.CENTER);
        startDateBox.getChildren().addAll(startDateLabel, startDatePicker);
        startDateBox.setAlignment(Pos.CENTER);
        startDateBox.setSpacing(15);

        endDateLabel.setAlignment(Pos.CENTER);
        endDateBox.getChildren().addAll(endDateLabel, endDatePicker);
        endDateBox.setAlignment(Pos.CENTER);
        endDateBox.setSpacing(15);

        submitScoresDateLabel.setAlignment(Pos.CENTER);
        submitScoresBox.getChildren().addAll(submitScoresDateLabel, submitScoresDatePicker);
        submitScoresBox.setAlignment(Pos.CENTER);
        submitScoresBox.setSpacing(15);

        addButton.setOnAction(event -> {
            Date startDate = new Date(startDatePicker.getValue().getDayOfMonth(), startDatePicker.getValue().getMonthValue(), startDatePicker.getValue().getYear());
            Date endDate = new Date(endDatePicker.getValue().getDayOfMonth(), endDatePicker.getValue().getMonthValue(), endDatePicker.getValue().getYear());
            Date submitScoresDate = new Date(submitScoresDatePicker.getValue().getDayOfMonth(), submitScoresDatePicker.getValue().getMonthValue(), submitScoresDatePicker.getValue().getYear());
            Term tempTerm = new Term(nameTextField.getText(), submitScoresDate, startDate, endDate);
            message.setAlignment(Pos.CENTER);
            message.setText("Successful");
            message.setTextFill(Color.rgb(0, 255, 0));
        });
        total.getChildren().addAll(titleLabel, nameBox, startDateBox, endDateBox, submitScoresBox, addButton, message);
        total.setAlignment(Pos.CENTER);
        total.setSpacing(20);
        Scene addTermScene = new Scene(total, 1200, 700);
        Stage addTermStage = new Stage();
        addTermStage.setScene(addTermScene);
        addTermStage.show();
    }
    }
}
