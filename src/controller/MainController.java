package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    public Button duaButton;
    @FXML
    public Button empatButton;
    @FXML
    public AnchorPane anchorUtama;

    public void duaAction(ActionEvent actionEvent) {
        AnchorPane pane = null;
        try {
            pane = FXMLLoader.load(getClass().getResource("../view/MenuMatrixDua.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        anchorUtama.getChildren().setAll(pane);
        System.out.println("Matrix 2 x 2");
    }

    public void empatAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/MenuMatrixEmpat.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Matriks Strassen");

        stage.show();
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();
        System.out.println("Matrix 4 x 4");
    }
}
