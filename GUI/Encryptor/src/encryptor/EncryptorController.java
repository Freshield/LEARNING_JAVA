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
import javafx.scene.control.TextField;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author FRESHIELD
 */
public class EncryptorController implements Initializable {
    
    Encrypt e;
    String inputText;
    String resultText;
    
    @FXML
    private Label label103;
    @FXML
    private TextField text01;
    @FXML
    private TextField text02;
    @FXML
    private Button newbutton;
    private Button loadbutton;
    private Button savebutton;
    private Button encodebutton;
    private Button decodebutton;
    private Button clearbutton;
    private Button copybutton;
    
    public EncryptorController()
    {
        text01 = new TextField();
        text02 = new TextField();
        e = null;
        inputText = "";
        resultText = "";
    }
    
    @FXML
    private void newMethod(ActionEvent event) {
        
        e = new Encrypt();
        
        e.setCode();
        
        String temp = new String(e.getCode());
        
        label103.setText(temp);
    }
    
    @FXML
    private void loadMethod(ActionEvent event) {
        
        try
        {
            FileReader fr = new FileReader("encryptor.txt");
            BufferedReader r = new BufferedReader(fr);
            String ms = r.readLine();
            e = new Encrypt(ms);
            fr.close();
            label103.setText("ENCRYPT OBJECT IS LOADED");
        }
        catch(IOException ex)
        {
            label103.setText("ENCRYPT OBJECT IS NOT LOADED");
        }
        finally
        {
            text02.setText("AFTER LOAD...");
        }
    }
    @FXML
    private void saveMethod(ActionEvent event) {
        
        try
        {
            if(e == null)
            {
                label103.setText("NO ENCRYPT OBJECT!!!");
            }
            else
            {
                File f = new File("encryptor.txt");
                FileWriter fw = new FileWriter(f);
                fw.write(String.valueOf(e.getCode()));
                fw.close();
            }
        }
        catch(IOException ex)
        {
            label103.setText("ENCRYPT OBJECT IS NOT SAVED");
        }
        finally
        {
            text02.setText("AFTER SAVE...");
        }
        
    }
    @FXML
    private void encodeMethod(ActionEvent event) {
        
        if(e == null)
        {
            label103.setText("NO ENCRYPT OBJECT!!!");
        }
        else
        {
            inputText = text01.getText();
            if(inputText.compareTo("") == 0)
            {
                label103.setText("NO INPUT STRING");
            }
            else
            {
                resultText = e.toEncode(inputText);
                text02.setText(resultText);
                label103.setText("THE RESULT IS ABOVE");
            }
            
        }
    }
    @FXML
    private void decodeMethod(ActionEvent event) {
        if(e == null)
        {
            label103.setText("NO ENCRYPT OBJECT!!!");
        }
        else
        {
            inputText = text01.getText();
            if(inputText.compareTo("") == 0)
            {
                label103.setText("NO INPUT STRING");
            }
            else
            {
                resultText = e.toDecode(inputText);
                text02.setText(resultText);
                label103.setText("THE RESULT IS ABOVE");
            }
            
        }
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
