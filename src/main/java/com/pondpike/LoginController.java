package com.pondpike;

import java.io.IOException;
import javafx.fxml.FXML;

public class LoginController {

    @FXML
    private void signUpClicked() throws IOException {
        App.setRoot("PondPikeSignUp");
    }
}
