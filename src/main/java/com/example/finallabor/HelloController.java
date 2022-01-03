package com.example.finallabor;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javax.swing.*;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        Stage stage = new Stage();
        stage.setTitle("Start");

        GUI myGui = new GUI();

        try{
            stage.hide();
            myGui.start(stage);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}