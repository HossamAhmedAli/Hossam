/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feistel.ciphar;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
/**
 *
 * @author Hossam
 */
public class FXMLDocumentController implements Initializable {
    
    //ObservableList<String> function=FXCollection.observableArrayList("Hossam","Ahmed");
    @FXML
    private Label output;
    @FXML
    private Label decryptlabel;
    @FXML
    private TextField plaintext;
    @FXML
    private TextField rounds;
    @FXML
    private TextField key;
    @FXML
    private ChoiceBox function;
    
   feistelcode obj=new feistelcode();
    
    
    @FXML
    private void encryptbutton(ActionEvent event) {
        
        output.setText(obj.encrypt(plaintext.getText(),key.getText(),(String) function.getSelectionModel().getSelectedItem(),4));
      //  output.setText((String) function.getSelectionModel().getSelectedItem());
    }
    @FXML
    private void decryptbutton(ActionEvent event) {
        
        decryptlabel.setText(obj.decrypt(output.getText(),key.getText(),(String) function.getSelectionModel().getSelectedItem(),4));
      //  output.setText((String) function.getSelectionModel().getSelectedItem());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        function.getItems().add("OR");
        function.getItems().add("AND");
    }    
    
}
