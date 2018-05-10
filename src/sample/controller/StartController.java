package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class StartController {
    public static final String headerText = "Start";

    @FXML private Label header;

    @FXML
    public void initialize() {
        header.setText(headerText);
    }

    public String getHeaderText() { return header.getText(); }
    public void setHeaderText(String text) { header.setText(text); }
}