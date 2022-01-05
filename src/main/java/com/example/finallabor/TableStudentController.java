package com.example.finallabor;

import Uni.Student;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class TableStudentController {

    @FXML
    public TableView Students;
    @FXML
    public TableColumn FirstName;

    @FXML
    public TableColumn LastName;

    @FXML
    public TableColumn StudentId;
    @FXML
    public TableColumn Credits;
    public TableStudentController() {
    }

    public void ConstructorTable(List<Student> studentList){

        for (Student student: studentList
             ) {


        }
    }
}
