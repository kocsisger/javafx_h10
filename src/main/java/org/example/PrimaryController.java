package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {

    //Töklecsó

    @FXML
    Label testLabel;

    @FXML
    private void switchToSecondary() throws IOException {
        //App.setRoot("secondary");
        testLabel.setText("Boldog Karácsonyt!!!");
    }
}
