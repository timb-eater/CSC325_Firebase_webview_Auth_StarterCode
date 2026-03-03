package com.example.csc325_firebase_webview_auth.view;

import javafx.application.Preloader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SplashScreen extends Preloader {
    private Stage splashStage;
    @Override
    public void start(Stage stage) throws Exception {
        // adapted from https://www.codecentric.de/en/knowledge-hub/blog/javafx-how-to-easily-implement-application-preloader-2
        this.splashStage = stage;
        Scene scene = new Scene(App.loadFXML("/files/SplashScreen.fxml"));
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void handleStateChangeNotification(StateChangeNotification info) {
        // Hide splash when main app is ready
        if (info.getType() == StateChangeNotification.Type.BEFORE_START) {
            splashStage.hide();
        }
    }

}
