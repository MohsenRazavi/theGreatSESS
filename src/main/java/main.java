import javafx.application.Application;
import javafx.stage.Stage;
import Code.*;

import java.io.FileNotFoundException;


public class main extends Application {
    App mainApp = new App();
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
//        mainApp.Login();
//        Views.EducationOfficerView.AddUser();
//        Views.EducationOfficerView.addCourse();
        Views.EducationOfficerView.addTerm();
    }
}
