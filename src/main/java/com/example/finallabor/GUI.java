package com.example.finallabor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GUI extends Application {


//    public static void main(String[] args) {
//        Application.launch();
//    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                GUI.class.getResource("window.fxml")
        );
        Scene scene = new Scene(loader.load(),400,300);
        primaryStage.setTitle("Student or Teacher");
        primaryStage.setScene(scene);
        primaryStage.show();
//        Parent root =loader.load();
//        primaryStage.setTitle("Main Menu");
//        primaryStage.setScene(new Scene(root, 400, 200));
//        primaryStage.show();
    }
}
