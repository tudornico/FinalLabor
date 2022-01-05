package com.example.finallabor;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class TableStudentUI extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader =new FXMLLoader(
                TableStudentController.class.getResource("TableStudent.fxml")
        );
    }
}
