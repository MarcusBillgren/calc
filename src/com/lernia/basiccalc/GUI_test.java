package com.lernia.basiccalc;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI_test extends Application {

    Button button1, button2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start (Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        //Create button and set visible text
        button1 = new Button();
        button1.setText("1");

        //Set action for clicking the button
        button1.setOnAction(e -> System.out.println("1"));

        button2 = new Button();
        button2.setText("2");

        button2.setOnAction(e -> System.out.println("Number 2"));

        //Create text field
        //Missing logic to insert the arithmetic in our text field
        TextField calcInput = new TextField();
        calcInput.setOnAction(e -> System.out.println(""));

        //Creating a layout that we are using for our Scene
        VBox layout = new VBox(10);
        layout.getChildren().addAll(button1, button2, calcInput);
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
