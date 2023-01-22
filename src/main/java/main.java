import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
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

        usernameLabel.setText("username :");
        passwordLabel.setText("password :");

//        usernameBox.getChildren().addAll(usernameLabel, usernameField);
        usernameBox.setSpacing(15);
        usernameBox.setAlignment(Pos.CENTER);

//        passwordBox.getChildren().addAll(passwordLabel, passwordField);
        passwordBox.setSpacing(15);
        passwordBox.setAlignment(Pos.CENTER);

        loginButton.setLabel("Login");

//        formBox.getChildren().addAll(usernameBox, passwordBox, loginButton);

        Scene loginScene = new Scene(formBox, 400, 700);
        return loginScene;
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setScene(getLoginScene());
        primaryStage.show();
    }
}
