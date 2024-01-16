package com.calculator.simplecalculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Objects;

public class Calculator extends Application {

    TextField textField;

    @Override
    public void start(Stage stage){

        stage.setTitle("Calculator");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25,25,25,25));

        textField = new TextField();
        textField.setAlignment(Pos.BASELINE_RIGHT);
        textField.setPrefWidth(230);
        textField.setPrefHeight(100);
        textField.setEditable(false);
        textField.setStyle("-fx-font-size: 36px;");
        textField.setText("0");

        gridPane.add(textField,0,0,4,1);

        Button buttonNumberZero = new Button("0");
        buttonNumberZero.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        Button buttonNumberOne = new Button("1");
        buttonNumberOne.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        Button buttonNumberTwo = new Button("2");
        buttonNumberTwo.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        Button buttonNumberThree = new Button("3");
        buttonNumberThree.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        Button buttonNumberFour = new Button("4");
        buttonNumberFour.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        Button buttonNumberFive = new Button("5");
        buttonNumberFive.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        Button buttonNumberSix = new Button("6");
        buttonNumberSix.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        Button buttonNumberSeven = new Button("7");
        buttonNumberSeven.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        Button buttonNumberEight = new Button("8");
        buttonNumberEight.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        Button buttonNumberNine = new Button("9");
        buttonNumberNine.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        Button buttonOperationAddition = new Button("+");
        buttonOperationAddition.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        Button buttonOperationSubtraction = new Button("-");
        buttonOperationSubtraction.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        Button buttonOperationMultiplication = new Button("*");
        buttonOperationMultiplication.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        Button buttonOperationDivision = new Button("/");
        buttonOperationDivision.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        Button buttonOperationEquals = new Button("=");
        buttonOperationEquals.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        Button buttonOperationClear = new Button("C");
        buttonOperationClear.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-size: 18px; -fx-pref-width: 50px; -fx-pref-height: 50px;");

        // Row 2
        gridPane.add(buttonOperationClear,2,1);
        gridPane.add(buttonOperationDivision,3,1);

        // Row 3
        gridPane.add(buttonNumberSeven,0,2);
        gridPane.add(buttonNumberEight,1,2);
        gridPane.add(buttonNumberNine,2,2);
        gridPane.add(buttonOperationMultiplication,3,2);

        // Row 4
        gridPane.add(buttonNumberFour,0,3);
        gridPane.add(buttonNumberFive,1,3);
        gridPane.add(buttonNumberSix,2,3);
        gridPane.add(buttonOperationSubtraction,3,3);

        // Row 5
        gridPane.add(buttonNumberOne,0,4);
        gridPane.add(buttonNumberTwo,1,4);
        gridPane.add(buttonNumberThree,2,4);
        gridPane.add(buttonOperationAddition,3,4);

        // Row 6
        gridPane.add(buttonNumberZero,1,5);
        gridPane.add(buttonOperationEquals,3,5);

        // Events
        buttonNumberZero.setOnAction(event -> handleButtonPressNumber("0"));
        buttonNumberOne.setOnAction(event -> handleButtonPressNumber("1"));
        buttonNumberTwo.setOnAction(event -> handleButtonPressNumber("2"));
        buttonNumberThree.setOnAction(event -> handleButtonPressNumber("3"));
        buttonNumberFour.setOnAction(event -> handleButtonPressNumber("4"));
        buttonNumberFive.setOnAction(event -> handleButtonPressNumber("5"));
        buttonNumberSix.setOnAction(event -> handleButtonPressNumber("6"));
        buttonNumberSeven.setOnAction(event -> handleButtonPressNumber("7"));
        buttonNumberEight.setOnAction(event -> handleButtonPressNumber("8"));
        buttonNumberNine.setOnAction(event -> handleButtonPressNumber("9"));

        buttonOperationClear.setOnAction(event -> handleButtonPressClear());

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.show();
    }

    private void handleButtonPressNumber(String buttonValue) {
        if (Objects.equals(textField.getText(), "0") && !Objects.equals(buttonValue, "0")){
            textField.setText(buttonValue);
        } else if (!Objects.equals(textField.getText(), "0")){
            textField.setText(textField.getText() + buttonValue);
        }
    }

    private void handleButtonPressClear() {
        textField.setText("0");
    }

    public static void main(String[] args) {
        launch();
    }
}