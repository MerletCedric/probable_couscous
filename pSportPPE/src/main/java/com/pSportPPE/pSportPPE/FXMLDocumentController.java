package com.pSportPPE.pSportPPE;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


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
    
    public void LoginpaneShow () {
    	pane_login.setVisible(true);
    	pane_signup.setVisible(false);
    }
    
    public void SignuppaneShow () {
    	pane_login.setVisible(false);
    	pane_signup.setVisible(true);
    }
	
	@Override
	public void initialize (URL url, ResourceBundle rb) {
		// TODO
	}

}
