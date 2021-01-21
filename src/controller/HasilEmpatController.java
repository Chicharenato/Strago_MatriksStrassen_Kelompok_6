package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HasilEmpatController {
    @FXML
    public Label hasilStrassen11;
    @FXML
    public Label hasilStrassen12;
    @FXML
    public Label hasilStrassen13;
    @FXML
    public Label hasilStrassen14;
    @FXML
    public Label hasilStrassen21;
    @FXML
    public Label hasilStrassen22;
    @FXML
    public Label hasilStrassen23;
    @FXML
    public Label hasilStrassen24;
    @FXML
    public Label hasilStrassen31;
    @FXML
    public Label hasilStrassen32;
    @FXML
    public Label hasilStrassen33;
    @FXML
    public Label hasilStrassen34;
    @FXML
    public Label hasilStrassen41;
    @FXML
    public Label hasilStrassen42;
    @FXML
    public Label hasilStrassen43;
    @FXML
    public Label hasilStrassen44;

    public void isiLabel(int hasil1, int hasil2, int hasil3, int hasil4, int hasil5, int hasil6, int hasil7, int hasil8, int hasil9, int hasil10, int hasil11, int hasil12, int hasil13, int hasil14, int hasil15, int hasil16) {
        hasilStrassen11.setText(String.valueOf(hasil1));
        hasilStrassen12.setText(String.valueOf(hasil2));
        hasilStrassen13.setText(String.valueOf(hasil3));
        hasilStrassen14.setText(String.valueOf(hasil4));
        hasilStrassen21.setText(String.valueOf(hasil5));
        hasilStrassen22.setText(String.valueOf(hasil6));
        hasilStrassen23.setText(String.valueOf(hasil7));
        hasilStrassen24.setText(String.valueOf(hasil8));
        hasilStrassen31.setText(String.valueOf(hasil9));
        hasilStrassen32.setText(String.valueOf(hasil10));
        hasilStrassen33.setText(String.valueOf(hasil11));
        hasilStrassen34.setText(String.valueOf(hasil12));
        hasilStrassen41.setText(String.valueOf(hasil13));
        hasilStrassen42.setText(String.valueOf(hasil14));
        hasilStrassen43.setText(String.valueOf(hasil15));
        hasilStrassen44.setText(String.valueOf(hasil16));
    }
}
