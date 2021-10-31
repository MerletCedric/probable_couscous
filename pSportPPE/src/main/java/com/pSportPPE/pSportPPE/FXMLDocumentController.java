package com.pSportPPE.pSportPPE;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.sql.ResultSet;


/**
 * @author cedric
 *
 */
public class FXMLDocumentController implements Initializable {
	
	@FXML
    private Button btn_login;

    @FXML
    private AnchorPane pane_login;

    @FXML
    private AnchorPane pane_signup;

    @FXML
    private TextField txt_mail_up;

    @FXML
    private PasswordField txt_password;

    @FXML
    private TextField txt_password_up;

    @FXML
    private TextField txt_username;

    @FXML
    private TextField txt_username_up;

    @FXML
    private ComboBox<?> type;

    @FXML
    private ComboBox<?> type_up;
    
  
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
   
    /**
     *  Fonction permettant de switch vers la page connexion
     */
    public void LoginpaneShow () {
    	pane_login.setVisible(true);
    	pane_signup.setVisible(false);
    }
    
    /**
     *  Fonction permettant de switch vers la page inscription
     */
    public void SignuppaneShow () {
    	pane_login.setVisible(false);
    	pane_signup.setVisible(true);
    }
	
    /**
     * @param event lorsque l'on presse un bouton
     * @throws Exception 
     */
    @FXML 
    private void Login (ActionEvent event) throws Exception {
    	conn = SQLdbConnection.ConnectDb();
    	String sql = "Select * from USERS where USERNAME = ? and PASSWORD = ?";
    	
    	try {
    		pst = conn.prepareStatement(sql);
    		pst.setString(1, txt_username.getText());
    		pst.setString(2, txt_password.getText());
    		rs = pst.executeQuery();
    		if(rs.next()) {
    			 JOptionPane.showMessageDialog(null, "Nom d'utilisateur et mot de passe correct");
    			 btn_login.getScene().getWindow().hide();
    			 Parent root = FXMLLoader.load(getClass().getResource("Client.fxml"));
    			 Stage mainStage = new Stage (); 
    			 Scene scene = new Scene (root);
    			 mainStage.setScene(scene);
    			 mainStage.show();
    		} else 
    		JOptionPane.showMessageDialog(null, "Nom d'utilisateur et/ou mot de passe Incorrect");
    	} catch (Exception e) {
    		System.out.println(e);
    	}
    }
    
	@Override
	public void initialize (URL url, ResourceBundle rb) {
		// TODO
	}

}
