package com.pondpike;

import java.io.IOException;
import javafx.fxml.FXML;

public class SignUpController {

    @FXML
    private void returnHome() throws IOException {
        App.setRoot("PondpikeLogin");
    }
}