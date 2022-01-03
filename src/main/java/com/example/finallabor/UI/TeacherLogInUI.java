package com.example.finallabor.UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TeacherLogInUI  extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getClassLoader().getResource("resources/TeacherLogIn.fxml"));

        Parent root = fxmlLoader.load();
        primaryStage.setTitle("Teacher Login");
        primaryStage.setScene(new Scene(root,400,300));
        primaryStage.show();
    }
}
