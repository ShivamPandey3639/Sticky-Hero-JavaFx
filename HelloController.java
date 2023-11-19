package com.example.stickyhero;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button play;
    @FXML
    private Button demo;
    @FXML
    private Button agreement;
    private Stage primaryStage;


    @FXML
    public void onHelloButtonClick(ActionEvent e) {
        if(e.getSource()==play){
            try {
                // Load the FXML file for the second screen
                FXMLLoader loader = new FXMLLoader(getClass().getResource("h.fxml"));
                Parent secondScreenParent = loader.load();

                // Get the controller for the second screen
//                SecondScreenController secondScreenController = loader.getController();

                // Set any data or perform any initialization on the second screen controller if needed
                // secondScreenController.initializeData();

                // Create a new scene with the second screen and set it on the stage
                Scene secondScene = new Scene(secondScreenParent, 300, 200);
                primaryStage.setScene(secondScene);

            } catch (Exception k) {
                k.printStackTrace();

            }
        }


    }
    @FXML
    public void onDemo(ActionEvent e) {
        if (e.getSource() == demo) {
            try {
                // Load the FXML file for the second screen
                FXMLLoader loader = new FXMLLoader(getClass().getResource("demo.fxml"));
                Parent secondScreenParent = loader.load();

                // Get the controller for the second screen
//                SecondScreenController secondScreenController = loader.getController();

                // Set any data or perform any initialization on the second screen controller if needed
                // secondScreenController.initializeData();

                // Create a new scene with the second screen and set it on the stage
                Scene secondScene = new Scene(secondScreenParent, 300, 200);
                primaryStage.setScene(secondScene);

            } catch (Exception k) {
                k.printStackTrace();

            }
        }
    }
    @FXML
    public void onP(ActionEvent e) {
        if (e.getSource() == agreement) {
            try {
                // Load the FXML file for the second screen
                FXMLLoader loader = new FXMLLoader(getClass().getResource("P.fxml"));
                Parent secondScreenParent = loader.load();

                // Get the controller for the second screen
//                SecondScreenController secondScreenController = loader.getController();

                // Set any data or perform any initialization on the second screen controller if needed
                // secondScreenController.initializeData();

                // Create a new scene with the second screen and set it on the stage
                Scene secondScene = new Scene(secondScreenParent, 300, 200);
                primaryStage.setScene(secondScene);

            } catch (Exception k) {
                k.printStackTrace();

            }
        }
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}