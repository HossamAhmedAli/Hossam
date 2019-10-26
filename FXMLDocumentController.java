/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hossamplay;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Hossam
 */
public class FXMLDocumentController implements Initializable {
    cryp ob=new cryp();
    
    @FXML
    private Label output;
    @FXML
    private TextField plaintext;
    @FXML
    private TextField key;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        ob.setKey(key.getText());
        ob.KeyGen();
        output.setText( ob.encryptMessage(plaintext.getText()));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
