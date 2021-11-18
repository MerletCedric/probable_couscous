package com.pSportPPE.pSportPPE;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GestionnaireController implements Initializable {

	@FXML
	private Button btn_TopDeconnexion;

	@FXML
	private AnchorPane pane_dbGestionnaire;
	
	public void Deconnexion() {
		try {
			btn_TopDeconnexion.getScene().getWindow().hide();
			Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
			Stage mainStage = new Stage();
			Scene scene = new Scene(root);
			mainStage.setScene(scene);
			mainStage.show();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
