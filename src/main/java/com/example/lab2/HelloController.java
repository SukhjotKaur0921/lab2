package com.example.lab2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private ComboBox<String> genderComboBox;

    @FXML
    private void registerButtonClicked(ActionEvent event) {
        // Handle registration logic here
        String name = nameField.getText();
        String email = emailField.getText();
        String gender = genderComboBox.getValue();

        // Example: Print the entered data
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
    }
}
