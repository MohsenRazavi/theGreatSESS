import javafx.application.Application;
import javafx.stage.Stage;
import Code.*;


public class main extends Application {
    App mainApp = new App();
    @Override
    public void start(Stage primaryStage) {
        mainApp.Login();
//        mainApp.AddUser();
    }
}
