package com.example.finallabor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StudentInterface extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader =new FXMLLoader(
                StudentInterface.class.getResource("StudentInterface.fxml")
        );
        Scene scene  = new Scene(fxmlLoader.load(),800,400);
        primaryStage.setTitle("LogIn Student");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
