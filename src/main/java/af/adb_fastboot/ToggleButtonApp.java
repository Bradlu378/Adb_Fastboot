package af.adb_fastboot;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class ToggleButtonApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override    public void start(Stage primaryStage) {
        primaryStage.setTitle("Toggle Button");

        CheckBox hideCheckbox = new CheckBox();
        hideCheckbox.setId("hide-checkbox");

        StackPane toggleButton = new StackPane();
        toggleButton.getStyleClass().add("toggle-button");

        VBox toggleContainer = new VBox(toggleButton);
        toggleContainer.getStyleClass().add("toggle");

        VBox wrapper = new VBox(hideCheckbox, toggleContainer);
        wrapper.getStyleClass().add("wrapper");

        Scene scene = new Scene(wrapper, 400, 200);
        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}