package com.example.finallabor;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {



    @FXML
    Button LogInStudent;

    @FXML
    Button LogInTeacher;
    @FXML
    public void LogInStudent() throws Exception {
        Stage stage = new Stage();
        stage.setTitle("Login Student");

        StudentLogInUI logInUI = new StudentLogInUI();

        logInUI.start(stage);

    }
    @FXML
    public void LogInTeacher() throws Exception {
        Stage stage = new Stage();
        stage.setTitle("Login Teacher");

        TeacherLogInUI teacherLogInUI = new TeacherLogInUI();
        teacherLogInUI.start(stage);
    }

}
