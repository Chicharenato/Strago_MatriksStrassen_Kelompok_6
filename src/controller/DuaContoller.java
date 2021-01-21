package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DuaContoller {
    @FXML
    public AnchorPane anchorDuaMatrix;
    @FXML
    public TextField satuA;
    @FXML
    public TextField satuB;
    @FXML
    public TextField satuC;
    @FXML
    public TextField satuD;
    @FXML
    public TextField duaE;
    @FXML
    public TextField duaF;
    @FXML
    public TextField duaG;
    @FXML
    public TextField duaH;
    @FXML
    public Button submitButton;

    int A, B, C, D, E, F, G, H;
    int P1, P2, P3, P4, P5, P6, P7;
    int strassen1, strassen2, strassen3, strassen4;

    public void submitAction(ActionEvent actionEvent) throws IOException {

        A = Integer.parseInt(satuA.getText());
        B = Integer.parseInt(satuB.getText());
        C = Integer.parseInt(satuC.getText());
        D = Integer.parseInt(satuD.getText());
        E = Integer.parseInt(duaE.getText());
        F = Integer.parseInt(duaF.getText());
        G = Integer.parseInt(duaG.getText());
        H = Integer.parseInt(duaH.getText());


        P1 = A * (F - H);
        P2 = (A + B) * H;
        P3 = (C + D) * E;
        P4 = D * (G - E);
        P5 = (A + D) * (E + H);
        P6 = (B - D) * (G + H);
        P7 = (A - C) * (E + F);

        System.out.println("P1 = " + P1);
        System.out.println("P2 = " + P2);
        System.out.println("P3 = " + P3);
        System.out.println("P4 = " + P4);
        System.out.println("P5 = " + P5);
        System.out.println("P6 = " + P6);
        System.out.println("P7 = " + P7);

        strassen1 = P5 + P4 - P2 + P6;
        strassen2 = P1 + P2;
        strassen3 = P3 + P4;
        strassen4 = P1 + P5 - P3 - P7;

        System.out.println("Strassen 1 = " + strassen1);
        System.out.println("Strassen 2 = " + strassen2);
        System.out.println("Strassen 3 = " + strassen3);
        System.out.println("Strassen 4 = " + strassen4);

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/HasilMatrixDua.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Matriks Strassen");

        HasilDuaController hasil2 = loader.getController();
        hasil2.isiLabel(strassen1, strassen2, strassen3, strassen4);

        stage.show();
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();

//        AnchorPane pane = FXMLLoader.load(getClass().getResource("../View/HasilMatrixDua.fxml"));
//        anchorDuaMatrix.getChildren().setAll(pane);
    }
}
