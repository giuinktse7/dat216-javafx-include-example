package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static final int minWidth = 400;
    private static final int minHeight = 300;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/sample.fxml"));

        primaryStage.setTitle("Example for fx:include");
        primaryStage.setScene(new Scene(root, minWidth, minHeight));
        primaryStage.setMinWidth(minWidth);
        primaryStage.setMinHeight(minHeight);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
