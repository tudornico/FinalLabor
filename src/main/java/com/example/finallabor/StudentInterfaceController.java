package com.example.finallabor;

import Registration.RegistrationSystem;
import Uni.Course;
import Uni.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StudentInterfaceController {
    private Student student;
    private static StudentInterfaceController instance=null;
    public StudentInterfaceController() {}

    public void setStudent(Student student) {
        this.student = student;
    }
    @FXML
    public Button Register;

    @FXML
    public Button AllStudents;



    public  static StudentInterfaceController Instance(Student student){
        // todo always clear the instace if a new object is to be created
        if(instance == null){
            instance = new StudentInterfaceController();
            instance.setStudent(student);
        }
        return instance;
    }



    public Student getStudent() {
        return student;
    }



    @FXML
    public void registerToCourse(){
        RegistrationSystem system = new RegistrationSystem();
        system.register(null, instance.getStudent());
    }

    @FXML
    public void AllStudentsFromCourse(){

    }
}
