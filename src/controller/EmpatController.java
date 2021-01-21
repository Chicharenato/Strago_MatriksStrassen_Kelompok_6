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

public class EmpatController {

    @FXML
    public AnchorPane anchorEmpatMatrix;
    @FXML
    public TextField satuA;
    @FXML
    public TextField satuB;
    @FXML
    public TextField satuC;
    @FXML
    public TextField satuD;
    @FXML
    public TextField satuE;
    @FXML
    public TextField satuF;
    @FXML
    public TextField satuG;
    @FXML
    public TextField satuH;
    @FXML
    public TextField satuI;
    @FXML
    public TextField satuJ;
    @FXML
    public TextField satuK;
    @FXML
    public TextField satuL;
    @FXML
    public TextField satuM;
    @FXML
    public TextField satuN;
    @FXML
    public TextField satuO;
    @FXML
    public TextField satuP;
    @FXML
    public TextField duaA;
    @FXML
    public TextField duaB;
    @FXML
    public TextField duaC;
    @FXML
    public TextField duaD;
    @FXML
    public TextField duaE;
    @FXML
    public TextField duaF;
    @FXML
    public TextField duaG;
    @FXML
    public TextField duaH;
    @FXML
    public TextField duaI;
    @FXML
    public TextField duaJ;
    @FXML
    public TextField duaK;
    @FXML
    public TextField duaL;
    @FXML
    public TextField duaM;
    @FXML
    public TextField duaN;
    @FXML
    public TextField duaO;
    @FXML
    public TextField duaP;
    @FXML
    public Button submitButton;

    int A1, B1, C1, D1, E1, F1, G1, H1, I1, J1, K1, L1, M1, N1, O1, P1;
    int A2, B2, C2, D2, E2, F2, G2, H2, I2, J2, K2, L2, M2, N2, O2, P2;

    int P1_11, P1_12;
    int P1_21, P1_22;

    int P2_11, P2_12;
    int P2_21, P2_22;

    int P3_11, P3_12;
    int P3_21, P3_22;

    int P4_11, P4_12;
    int P4_21, P4_22;

    int P5_11, P5_12;
    int P5_21, P5_22;

    int P6_11, P6_12;
    int P6_21, P6_22;

    int P7_11, P7_12;
    int P7_21, P7_22;

    int coA11, coA12;
    int coA21, coA22;

    int coB11, coB12;
    int coB21, coB22;

    int st1, st2, st3, st4, st5, st6, st7, st8, st9, st10, st11, st12, st13, st14, st15, st16;


    public void submitAction(ActionEvent actionEvent) throws IOException {

        A1 = Integer.parseInt(satuA.getText());
        B1 = Integer.parseInt(satuB.getText());
        C1 = Integer.parseInt(satuC.getText());
        D1 = Integer.parseInt(satuD.getText());
        E1 = Integer.parseInt(satuE.getText());
        F1 = Integer.parseInt(satuF.getText());
        G1 = Integer.parseInt(satuG.getText());
        H1 = Integer.parseInt(satuH.getText());
        I1 = Integer.parseInt(satuI.getText());
        J1 = Integer.parseInt(satuJ.getText());
        K1 = Integer.parseInt(satuK.getText());
        L1 = Integer.parseInt(satuL.getText());
        M1 = Integer.parseInt(satuM.getText());
        N1 = Integer.parseInt(satuN.getText());
        O1 = Integer.parseInt(satuO.getText());
        P1 = Integer.parseInt(satuP.getText());

        A2 = Integer.parseInt(duaA.getText());
        B2 = Integer.parseInt(duaB.getText());
        C2 = Integer.parseInt(duaC.getText());
        D2 = Integer.parseInt(duaD.getText());
        E2 = Integer.parseInt(duaE.getText());
        F2 = Integer.parseInt(duaF.getText());
        G2 = Integer.parseInt(duaG.getText());
        H2 = Integer.parseInt(duaH.getText());
        I2 = Integer.parseInt(duaI.getText());
        J2 = Integer.parseInt(duaJ.getText());
        K2 = Integer.parseInt(duaK.getText());
        L2 = Integer.parseInt(duaL.getText());
        M2 = Integer.parseInt(duaM.getText());
        N2 = Integer.parseInt(duaN.getText());
        O2 = Integer.parseInt(duaO.getText());
        P2 = Integer.parseInt(duaP.getText());

        coA11 = -C1 + I1 + K1;
        coA12 = -D1 + J1 + L1;
        coA21 = -G1 + M1 + O1;
        coA22 = -H1 + N1 + P1;

        coB11 = A2 + C2 - I2;
        coB12 = B2 + D2 - J2;
        coB21 = E2 + G2 - M2;
        coB22 = F2 + H2 - N2;

        System.out.println("coA11 = " + coA11);
        System.out.println("coB11 = " + coB11);

        P1_11 = (coA11 * coB11) + (coA12 * coB21);
        P1_12 = (coA11 * coB12) + (coA12 * coB22);
        P1_21 = (coA21 * coB11) + (coA22 * coB21);
        P1_22 = (coA21 * coB12) + (coA22 * coB22);

        System.out.println("P1_11 = " + P1_11);
        System.out.println("P1_12 = " + P1_12);
        System.out.println("P1_21 = " + P1_21);
        System.out.println("P1_22 = " + P1_22);


        coA11 = A1 + C1 - I1 - K1;
        coA12 = B1 + D1 - J1 - L1;
        coA21 = E1 + G1 - M1 - O1;
        coA22 = F1 + H1 - N1 - P1;

        coB11 = A2 + C2;
        coB12 = B2 + D2;
        coB21 = E2 + G2;
        coB22 = F2 + H2;

        System.out.println("coA11 = " + coA11);
        System.out.println("coB11 = " + coB11);

        P2_11 = (coA11 * coB11) + (coA12 * coB21);
        P2_12 = (coA11 * coB12) + (coA12 * coB22);
        P2_21 = (coA21 * coB11) + (coA22 * coB21);
        P2_22 = (coA21 * coB12) + (coA22 * coB22);

        System.out.println("P2_11 = " + P2_11);
        System.out.println("P2_12 = " + P2_12);
        System.out.println("P2_21 = " + P2_21);
        System.out.println("P2_22 = " + P2_22);

        coA11 = -I1;
        coA12 = -J1;
        coA21 = -M1;
        coA22 = -N1;

        coB11 = A2 - I2;
        coB12 = B2 - J2;
        coB21 = E2 - M2;
        coB22 = F2 - N2;

        System.out.println("coA11 = " + coA11);
        System.out.println("coB11 = " + coB11);

        P3_11 = (coA11 * coB11) + (coA12 * coB21);
        P3_12 = (coA11 * coB12) + (coA12 * coB22);
        P3_21 = (coA21 * coB11) + (coA22 * coB21);
        P3_22 = (coA21 * coB12) + (coA22 * coB22);

        System.out.println("P3_11 = " + P3_11);
        System.out.println("P3_12 = " + P3_12);
        System.out.println("P3_21 = " + P3_21);
        System.out.println("P3_22 = " + P3_22);

        coA11 = C1;
        coA12 = D1;
        coA21 = G1;
        coA22 = H1;

        coB11 = K2;
        coB12 = L2;
        coB21 = O2;
        coB22 = P2;

        System.out.println("coA11 = " + coA11);
        System.out.println("coB11 = " + coB11);

        P4_11 = (coA11 * coB11) + (coA12 * coB21);
        P4_12 = (coA11 * coB12) + (coA12 * coB22);
        P4_21 = (coA21 * coB11) + (coA22 * coB21);
        P4_22 = (coA21 * coB12) + (coA22 * coB22);

        System.out.println("P4_11 = " + P4_11);
        System.out.println("P4_12 = " + P4_12);
        System.out.println("P4_21 = " + P4_21);
        System.out.println("P4_22 = " + P4_22);

        coA11 = -C1 + K1;
        coA12 = -D1 + L1;
        coA21 = -G1 + O1;
        coA22 = -H1 + P1;

        coB11 = -A2 - C2 + I2 + K2;
        coB12 = -B2 - D2 + J2 + L2;
        coB21 = -E2 - G2 + M2 + O2;
        coB22 = -F2 - H2 + N2 + P2;

        System.out.println("coA11 = " + coA11);
        System.out.println("coB11 = " + coB11);

        P5_11 = (coA11 * coB11) + (coA12 * coB21);
        P5_12 = (coA11 * coB12) + (coA12 * coB22);
        P5_21 = (coA21 * coB11) + (coA22 * coB21);
        P5_22 = (coA21 * coB12) + (coA22 * coB22);

        System.out.println("P5_11 = " + P5_11);
        System.out.println("P5_12 = " + P5_12);
        System.out.println("P5_21 = " + P5_21);
        System.out.println("P5_22 = " + P5_22);

        coA11 = A1;
        coA12 = B1;
        coA21 = E1;
        coA22 = F1;

        coB11 = -C2;
        coB12 = -D2;
        coB21 = -G2;
        coB22 = -H2;

        System.out.println("coA11 = " + coA11);
        System.out.println("coB11 = " + coB11);

        P6_11 = (coA11 * coB11) + (coA12 * coB21);
        P6_12 = (coA11 * coB12) + (coA12 * coB22);
        P6_21 = (coA21 * coB11) + (coA22 * coB21);
        P6_22 = (coA21 * coB12) + (coA22 * coB22);

        System.out.println("P6_11 = " + P6_11);
        System.out.println("P6_12 = " + P6_12);
        System.out.println("P6_21 = " + P6_21);
        System.out.println("P6_22 = " + P6_22);

        coA11 = I1 + K1;
        coA12 = J1 + L1;
        coA21 = M1 + O1;
        coA22 = N1 + P1;

        coB11 = I2;
        coB12 = J2;
        coB21 = M2;
        coB22 = N2;

        System.out.println("coA11 = " + coA11);
        System.out.println("coB11 = " + coB11);

        P7_11 = (coA11 * coB11) + (coA12 * coB21);
        P7_12 = (coA11 * coB12) + (coA12 * coB22);
        P7_21 = (coA21 * coB11) + (coA22 * coB21);
        P7_22 = (coA21 * coB12) + (coA22 * coB22);

        System.out.println("P7_11 = " + P7_11);
        System.out.println("P7_12 = " + P7_12);
        System.out.println("P7_21 = " + P7_21);
        System.out.println("P7_22 = " + P7_22);

        st1 = P1_11 + P2_11 + P6_11 + P7_11;
        st2 = P4_11 - P6_11;
        st5 = -P3_11 + P7_11;
        st6 = P1_11 + P3_11 + P4_11 + P5_11;

        st3 = P1_12 + P2_12 + P6_12 + P7_12;
        st4 = P4_12 - P6_12;
        st7 = -P3_12 + P7_12;
        st8 = P1_12 + P3_12 + P4_12 + P5_12;

        st9 = P1_21 + P2_21 + P6_21 + P7_21;
        st10 = P4_21 - P6_21;
        st13 = -P3_21 + P7_21;
        st14 = P1_21 + P3_21 + P4_21 + P5_21;

        st11 = P1_22 + P2_22 + P6_22 + P7_22;
        st12 = P4_22 - P6_22;
        st15 = -P3_22 + P7_22;
        st16 = P1_22 + P3_22 + P4_22 + P5_22;

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/HasilMatrixEmpat.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Matriks Strassen");

        HasilEmpatController hasil4 = loader.getController();
        hasil4.isiLabel(st1, st2, st3, st4, st5, st6, st7, st8, st9, st10, st11, st12, st13, st14, st15, st16);

        stage.show();
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();

    }
}
