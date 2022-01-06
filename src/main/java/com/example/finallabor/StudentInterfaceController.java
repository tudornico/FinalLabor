package com.example.finallabor;

import Registration.RegistrationSystem;
import Repo.CourseRepo;
import Repo.StudentRepo;
import Sigletons.SingleCourse;
import Uni.Course;
import Uni.Student;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Statement;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StudentInterfaceController {
    @FXML
    public Button CourseSubmit;
    @FXML
    public TextField SelectedCourse;
    @FXML
    public Button AllStudents;

    @FXML
    public Button Credits;
    public TextField CurrentCredits;

    private Student student;
    private Course course;
    private static StudentInterfaceController instance=null;
    public StudentInterfaceController() {}

    private void setStudent(Student student) {
        instance.student = student;
    }
    @FXML
    public Button Register;






    public  static StudentInterfaceController Instance(Student student){
        if(instance==null) {
            instance = new StudentInterfaceController();
        }
        instance.setStudent(student);
        return instance;
    }

    public void CourseSelected(){

        String courseID = SelectedCourse.getText();
        CourseRepo repo = new CourseRepo();
        try {
            instance.course = repo.findOne(Integer.parseInt(courseID));
        }
        catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public Student getStudent() {
        return student;
    }



    @FXML
    public void registerToCourse() throws Exception {
        RegistrationSystem system = new RegistrationSystem();

        system.register(instance.course,instance.student);


    }

    @FXML
    public void AllStudentsFromCourse() throws Exception {
        //the link works
        StudentRepo repo = new StudentRepo();
        List<Student> studentList = repo.StudentsToCourse(instance.course);
        for (Student student: studentList
             ) {

        }
        Stage stage = new Stage();
        stage.setTitle("Table Students");
        TableStudentUI tableStudentUI = new TableStudentUI();
        tableStudentUI.start(stage);
        System.out.println(studentList);
    }


    public void ShowCredits(){
        System.out.println(instance.getStudent().getTotalCredits());
        CurrentCredits.setText("Total Credits : "+ instance.getStudent().getTotalCredits());

    }


}
