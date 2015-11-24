/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptor;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author FRESHIELD
 */
public class EncryptorController implements Initializable {
    
    @FXML
    private Label label103;
    @FXML
    private Button newbutton;
    private Button loadbutton;
    private Button savebutton;
    private Button encodebutton;
    private Button decodebutton;
    private Button clearbutton;
    private Button copybutton;
    
    @FXML
    private void newMethod(ActionEvent event) {
        
        label103.setText("This is new button");
    }
    
    @FXML
    private void loadMethod(ActionEvent event) {
        
        label103.setText("This is load button");
    }
    @FXML
    private void saveMethod(ActionEvent event) {
        
        label103.setText("This is save button");
    }
    @FXML
    private void encodeMethod(ActionEvent event) {
        
        label103.setText("This is encode button");
    }
    @FXML
    private void decodeMethod(ActionEvent event) {
        
        label103.setText("This is decode button");
    }
    @FXML
    private void clearMethod(ActionEvent event) {
        
        label103.setText("This is clear button");
    }
    @FXML
    private void copyMethod(ActionEvent event) {
        
        label103.setText("This is copy button");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
