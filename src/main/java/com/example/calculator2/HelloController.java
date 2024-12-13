package com.example.calculator2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button buttonPlus;
    @FXML
    private Button buttonMinus;
    @FXML
    private Label result;
    @FXML
    private Button buttonPerc;
    @FXML
    private TextField num1;
    @FXML
    private Button buttonMult;
    @FXML
    private TextField num2;
    @FXML
    private Button buttonSlash;

    @FXML
    public void buttonClick() {

    }

    public void clickButtonPlus(ActionEvent actionEvent) {
        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        double c = a + b;
        result.setText(String.valueOf(c));
    }
    public void clickButtonMinus(ActionEvent actionEvent) {
        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        double c = a - b;
        result.setText(String.valueOf(c));
    }
    public void clickButtonMult(ActionEvent actionEvent) {
        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        double c = a * b;
        result.setText(String.valueOf(c));
    }
    public void clickButtonSlash(ActionEvent actionEvent) {
        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        double c = a / b;
        result.setText(String.valueOf(c));
    }
    public void clickButtonPerc(ActionEvent actionEvent) {
        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        double c = a % b;
        result.setText(String.valueOf(c));
    }

}