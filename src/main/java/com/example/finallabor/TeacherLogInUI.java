package com.example.finallabor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TeacherLogInUI  extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(
                TeacherLogInUI.class.getResource("TeacherLogIn.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),400,600);
        primaryStage.setTitle("Teacher Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
