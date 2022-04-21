package banks.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class Main extends Application {

    public static Scanner scanner;
    FileManeger fileManeger = new FileManeger();
    private static Stage stg;
    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        stage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Scene scene0 = new Scene(root, 800, 600);
        stage.setTitle("Java Bank Project");
        stage.setScene(scene0);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


    public void changeScene(String fxml) throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
        stg.setResizable(false);
    }

}