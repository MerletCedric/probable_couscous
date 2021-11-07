package com.pSportPPE.pSportPPE;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ClientController implements Initializable {

		@FXML
	    private Button btn_TopDeconnexion;

	    @FXML
	    private Button btn_fit;

	    @FXML
	    private Button btn_machineChoice;

	    @FXML
	    private Button btn_muscu;

	    @FXML
	    private Button btn_sortie;

	    @FXML
	    private Button btn_sortieFitness;

	    @FXML
	    private Circle couleur_fit;

	    @FXML
	    private Circle couleur_muscu;

	    @FXML
	    private AnchorPane pane_choix;

	    @FXML
	    private AnchorPane pane_ticketEntree_Fitness;

	    @FXML
	    private AnchorPane pane_ticketEntree_Musculation;

	    @FXML
	    private AnchorPane pane_ticketSortie;

	public void TicketEntreeMusculationShow() {
		pane_ticketEntree_Musculation.setVisible(true);
		pane_choix.setVisible(false);
		btn_TopDeconnexion.setDisable(true);

	}
	
	public void TicketEntreeFitnessShow() {
		pane_ticketEntree_Fitness.setVisible(true);
		pane_choix.setVisible(false);
		btn_TopDeconnexion.setDisable(true);

	}

	public void TicketSortieShow() {
		pane_ticketSortie.setVisible(true);
		pane_ticketEntree_Fitness.setVisible(false);
		pane_ticketEntree_Musculation.setVisible(false);
		btn_TopDeconnexion.setDisable(false);
	}

	public void ChoixMachineShow() {
		pane_choix.setVisible(true);
		pane_ticketSortie.setVisible(false);
	}

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
