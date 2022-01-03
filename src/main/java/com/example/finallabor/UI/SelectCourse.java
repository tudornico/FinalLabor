package com.example.finallabor.UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SelectCourse extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader =  new FXMLLoader(
                getClass().getResource("resources/SelectCourse.fxml")
        );
        Parent root =fxmlLoader.load();
        primaryStage.setTitle("Select The Course");
        primaryStage.setScene(new Scene(root,400,200));
        primaryStage.show();
    }


}
