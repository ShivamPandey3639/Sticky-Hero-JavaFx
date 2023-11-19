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
    private Character player;
    private Platform platform;
    private Stick stick;
    private Cherry cherry;
    private Level level;
    private Score score;


    @FXML
    public void onHelloButtonClick(ActionEvent e) {
        if(e.getSource()==play){
            try {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("h.fxml"));
                Parent secondScreenParent = loader.load();


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

                FXMLLoader loader = new FXMLLoader(getClass().getResource("demo.fxml"));
                Parent secondScreenParent = loader.load();


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

                FXMLLoader loader = new FXMLLoader(getClass().getResource("P.fxml"));
                Parent secondScreenParent = loader.load();


                Scene secondScene = new Scene(secondScreenParent, 300, 200);
                primaryStage.setScene(secondScene);

            } catch (Exception k) {
                k.printStackTrace();

            }
        }
    }
    public void play(ActionEvent e){}
    public void backToHome(ActionEvent e){}
    public void revive(Cherry e){}
    public void Restart(Level e){}
    public void Save(ActionEvent e){}
    public void Reward(Cherry e,Score s){}

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}