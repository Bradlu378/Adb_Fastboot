package af.adb_fastboot;

import af.adb_fastboot.JFX.JFXMain;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import modules.AccentColor;

import java.io.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        new ProcessBuilder("adb", "reconnect").start();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/scenes/start.fxml")));
        primaryStage.setTitle("Adb control app");
        //Scene scene = new Scene(root, Color.TRANSPARENT);
        Scene scene = new Scene(root);
        scene.setFill(Color.rgb(255, 165, 80));
        primaryStage.setScene(scene);
        //primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) throws IOException {
         launch();
    }
    @Override
    public void stop(){
    }
    @Override
    public void init(){
    }
}