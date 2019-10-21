/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hossam;

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
     public static StringBuffer encrypt(String text, int s) 
    { 
        StringBuffer result= new StringBuffer(); 
  
        for (int i=0; i<text.length(); i++) 
        { 
            if (Character.isUpperCase(text.charAt(i))) 
            { 
                char ch = (char)(((int)text.charAt(i) +s -65)%26+65 ); 
                result.append(ch); 
            } 
            else if (Character.isLowerCase(text.charAt(i)))
            { 
                char ch = (char)(((int)text.charAt(i) + s -97)% 26 + 97); 
                result.append(ch); 
            } 
            else
            {
                char ch='!';
                result.append(ch);
            }
        } 
        return result; 
    } 
     public static StringBuffer decrypt(String text, int s) 
    { 
        StringBuffer result= new StringBuffer(); 
  
        for (int i=0; i<text.length(); i++) 
        { 
            if (Character.isUpperCase(text.charAt(i))) 
            { 
                char ch = (char)(((int)text.charAt(i) -s -65)%26+65  ); 
                result.append(ch); 
            } 
            else if (Character.isLowerCase(text.charAt(i)))
            { 
                char ch = (char)(((int)text.charAt(i) - s -97)% 26 + 97); 
                result.append(ch); 
            } 
            else
            {
                char ch='!';
                result.append(ch);
            }
        } 
        return result; 
    } 
   
    
    
    
    
    @FXML
    private Label label;
    @FXML
    private TextField f1;
    @FXML
    private Label label2;
    

 
    
    @FXML
    private void decrypt(ActionEvent event) {
       String here= decrypt(label.getText(),1).toString();
        label2.setText(here);
    }
    @FXML
    private void hi(ActionEvent event) {
        System.out.println("You clicked me twice!");
        label2.setText("Hello World number 2!");
    }
    @FXML
    private void encrypt(ActionEvent event) {
     String here= encrypt(f1.getText(),1).toString();        
        label.setText(here);      
    }
    @FXML
    private void clear(ActionEvent event) {
       
        f1.setText("        ");
        label2.setText("       ");
        label.setText("       ");
        
    }   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}
