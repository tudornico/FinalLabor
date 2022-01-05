package com.example.finallabor;

import Repo.StudentRepo;
import Uni.Student;
import com.example.finallabor.StudentInterface;
import com.example.finallabor.StudentInterfaceController;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StudentLogInController {

    public TextField firstName;


    public TextField lastName;

    public Button Login;
    @FXML
    public void LogInAsStudent() throws Exception {


        String FirstName=firstName.getText();

        String LastName = lastName.getText();
        StudentRepo repo = new StudentRepo();
        Student student = repo.findStudent(FirstName,LastName);

        StudentInterface studentInterface =new StudentInterface();
        StudentInterfaceController controller = StudentInterfaceController.Instance(student);

        Stage stage = new Stage();
        stage.setTitle("Student Interface");
        //System.out.println(repo.findStudent(FirstName,LastName));
        studentInterface.start(stage);
    }
    }