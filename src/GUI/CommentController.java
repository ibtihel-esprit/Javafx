/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import entities.evenement;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;



        
       
/**
 * FXML Controller class
 *
 * @author pc-ibtihel
 */
public class CommentController implements Initializable {

    @FXML
    private Button affiche;
    @FXML
    private ImageView retour;



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    
        
       
    }    
     @FXML
    private void afficher(ActionEvent event) throws IOException {

            
              Parent root = FXMLLoader.load(getClass().getResource("participer.fxml"));
              Scene scene = new Scene(root);
              Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
              stage.setScene(scene);
              stage.show();
    }

  

    @FXML
    private void retour(ActionEvent event) throws IOException {
           
              Parent root = FXMLLoader.load(getClass().getResource("EventFront.fxml"));
              Scene scene = new Scene(root);
              Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
              stage.setScene(scene);
              stage.show();
    }



}
