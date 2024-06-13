package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    public TextArea textArea;
    public TextField textField;

    public HelloController() {
        ClientReceiver.controller = this;
    }

    @FXML
    public void onSendPress() {
        String text = textField.getText();
        textField.clear();
        textArea.appendText(text + "\n");
    }

    public void onMessage(String message) {
        textArea.appendText(message + "\n");
    }
}