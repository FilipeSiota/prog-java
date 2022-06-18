/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprograma;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Aluno
 */
public class TelaInicialController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Label label2;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("EU SOU O MILIOR!");
        label2.setText("EU SOU O MILIOR!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
