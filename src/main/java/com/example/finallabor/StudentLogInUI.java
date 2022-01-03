package com.example.finallabor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StudentLogInUI extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(
                StudentLogInUI.class.getResource("StudentLogIn.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),400,300);
        primaryStage.setTitle("Log in as Student");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
