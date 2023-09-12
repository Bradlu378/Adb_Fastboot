package af.adb_fastboot.JFX;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import modules.AccentColor;

import java.io.IOException;


public class JFXMain {
    @FXML
    private Circle c1;
    @FXML
    private Circle c2;
    @FXML
    private Circle c3;

    public void initialize() throws IOException {
c1.setFill(Color.valueOf(AccentColor.getHex().get()));
        c1.setFill(Color.valueOf(AccentColor.getHex().get()));
        c2.setFill(Color.valueOf(AccentColor.getHex().dark().get()));
        c3.setFill(Color.valueOf(AccentColor.getHex().darker().get()));
    }
}
