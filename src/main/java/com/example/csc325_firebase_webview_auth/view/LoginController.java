package com.example.csc325_firebase_webview_auth.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Button loginButton;
    @FXML private Label incorrectLabel;
    private static final String CORRECT_USERNAME = "root";
    private static final String CORRECT_PASSWORD = "root";

    @FXML
    private void handleLogin(ActionEvent event) throws IOException {
        incorrectLabel.setVisible(false);
        String enteredUsername = usernameField.getText();
        String enteredPassword = passwordField.getText();
        System.out.println("test");
        if (!enteredUsername.equals(CORRECT_USERNAME) || !enteredPassword.equals(CORRECT_PASSWORD)) {
            incorrectLabel.setVisible(true);
        } else {
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(App.loadFXML("/files/AccessFBView.fxml")));
        }
    }
}
