/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package sampleloris;

import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
public class FXMLDocumentController{
    
    @FXML
    private Label loginMessageLabel;
    
    
    @FXML
    private TextField emailTextField;
   
    @FXML
    private PasswordField passwordTextField;
    
    
   public void loginButtonOnAction(ActionEvent e){
     
       if(emailTextField.getText().isBlank() == false && passwordTextField.getText().isBlank() == false) {
           
             loginMessageLabel.setText("sample");       
       }else{
           
                 loginMessageLabel.setText("Please enter email address and password.");   
           
       }
 
       
       
   } 
    
 
    
}
   
