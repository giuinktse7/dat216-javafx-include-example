package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class CheckoutController {
    private static final String headerText = "Checkout";

    @FXML private Label header;

    @FXML
    public void initialize() {
        header.setText(headerText);
    }
}
