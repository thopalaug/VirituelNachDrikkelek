package Model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    Stage window;
    Scene setupWindow;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        Parent startWindow = FXMLLoader.load(getClass().getResource("/View/setupWindow.fxml"));

        int height = 700;
        int width = 700;

        setupWindow = new Scene(startWindow, height, width);

        primaryStage.setScene(setupWindow);
        primaryStage.setTitle("Virtual Nach");
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
        System.exit(0);

    }

}
