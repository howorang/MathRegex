package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private TextField expressionTextField;

    @FXML
    private Label resultLabel;

    @FXML
    private Button checkButton;

    public void initialize() {
        checkButton.setOnAction(event -> {
            resultLabel.setText(String.valueOf(Checker.check(expressionTextField.getText())));
        });
    }
}
