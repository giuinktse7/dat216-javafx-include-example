package sample.controller;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.util.Date;
import java.util.Optional;

public class MainController {

    @FXML private AnchorPane startView, checkoutView;

    /**
     * Javafx will attach a controller to a fx:include view by looking at the fx:id of that view.
     * Eg. If the fx:id is "startView", the corresponding controller variable must be named
     * "startViewController"
     */
    @FXML private StartController startViewController;
    @FXML private CheckoutController checkoutViewController;

    @FXML private StackPane contentPane;

    @FXML private Button changeHeaderButton;
    @FXML private Button changeStartHeaderTextButton;

    public void initialize() {
        changeHeaderButton.setOnMouseClicked(e -> toggleView());
        changeStartHeaderTextButton.setOnMouseClicked(e -> startViewController.setHeaderText(new Date().toString()));

        showView(startView);
    }

    /**
     * Display the view.
     */
    private void showView(Node view) {
        contentPane.getChildren().setAll(view);
    }

    /**
     *
     * @return The currently active view. Returns Optional.empty() if there is no current view.
     */
    private Optional<Node> getActiveView() {
        ObservableList<Node> children = contentPane.getChildren();
        return children.isEmpty() ? Optional.empty() : Optional.of(children.get(0));
    }

    /**
     * Swaps between the startView and the checkoutView.
     */
    private void toggleView() {
        getActiveView().ifPresent(view -> {
            if (view.equals(startView)) showView(checkoutView);
            if (view.equals(checkoutView)) showView(startView);
        });
    }
}
