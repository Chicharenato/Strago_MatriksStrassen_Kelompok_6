package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HasilDuaController {
    @FXML
    public Label hasilStrassen1;
    @FXML
    public Label hasilStrassen2;
    @FXML
    public Label hasilStrassen3;
    @FXML
    public Label hasilStrassen4;

    public void isiLabel(int hasil1, int hasil2, int hasil3, int hasil4) {
        hasilStrassen1.setText(String.valueOf(hasil1));
        hasilStrassen2.setText(String.valueOf(hasil2));
        hasilStrassen3.setText(String.valueOf(hasil3));
        hasilStrassen4.setText(String.valueOf(hasil4));
    }
}
