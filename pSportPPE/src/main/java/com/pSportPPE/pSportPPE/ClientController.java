package com.pSportPPE.pSportPPE;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;



import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * @author cedric
 *
 */
public class ClientController implements Initializable {

	@FXML
	private TextField NumEntreeFitness;

	@FXML
	private TextField NumEntreeMuscu;

	@FXML
	private Button btn_TopDeconnexion;

	@FXML
	private Button btn_entree;

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
	private Button btn_sortieMuscu;

	@FXML
	private Button btn_sortieTicket;

	@FXML
	private Circle couleur_fit;

	@FXML
	private Circle couleur_muscu;

	@FXML
	private TextField dateFitness;

	@FXML
	private TextField dateMuscu;

	@FXML
	private TextField dateSortie;

	@FXML
	private TextField heureFitness;

	@FXML
	private TextField heureMuscu;

	@FXML
	private TextField heureSortie;

	@FXML
	private AnchorPane pane_arrivee;

	@FXML
	private AnchorPane pane_choix;

	@FXML
	private AnchorPane pane_ticketEntree_Fitness;

	@FXML
	private AnchorPane pane_ticketEntree_Musculation;

	@FXML
	private AnchorPane pane_ticketSortie;

	@FXML
	private TextField placesDispFit;

	@FXML
	private TextField placesDispMuscu;

	@FXML
	private TextField placesOccFit;

	@FXML
	private TextField placesOccMuscu;

	@FXML
	private TextField prixSortie;

	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	String dateArrivee = com.pSportPPE.pSportPPE.Ticket.currentDay;
	String heureArrivee = com.pSportPPE.pSportPPE.Ticket.currentHour;

	/** 
	 * 
	 */
	public void TicketEntreeMusculationShow() {
		pane_ticketEntree_Musculation.setVisible(true);
		pane_choix.setVisible(false);
		btn_TopDeconnexion.setDisable(true);

		String numeroArrivee = com.pSportPPE.app.Arrivee.numeroI;
		System.out.println(numeroArrivee);
		NumEntreeMuscu.setText(numeroArrivee);

		dateMuscu.setText(dateArrivee);
		heureMuscu.setText(heureArrivee);

	}

	/**
	 * 
	 */
	public void TicketEntreeFitnessShow() {
		pane_ticketEntree_Fitness.setVisible(true);
		pane_choix.setVisible(false);
		btn_TopDeconnexion.setDisable(true);

		String numeroArrivee = com.pSportPPE.app.Arrivee.numeroI;
		System.out.println(numeroArrivee);
		NumEntreeFitness.setText(numeroArrivee);

		dateFitness.setText(dateArrivee);		
		heureFitness.setText(heureArrivee);

	}

	/**
	 * 
	 */
	public void TicketSortieShow() {
		pane_ticketSortie.setVisible(true);
		pane_ticketEntree_Fitness.setVisible(false);
		pane_ticketEntree_Musculation.setVisible(false);
		btn_TopDeconnexion.setDisable(false);
		
		dateSortie.setText(dateArrivee);
		heureSortie.setText(heureArrivee);

	}

	public void ArriveeShow() {
		pane_arrivee.setVisible(true);
		pane_ticketSortie.setVisible(false);
	}

	public void ChoixMachineShow() {
		pane_choix.setVisible(true);
		pane_ticketSortie.setVisible(false);
	}

	/**
	 * 
	 */
	public void EntreeSalle() {
		pane_choix.setVisible(true);
		pane_arrivee.setVisible(false);
	}

	public void SortieSalle() {
		pane_ticketSortie.setVisible(true);
		pane_ticketEntree_Fitness.setVisible(false);
		pane_ticketEntree_Musculation.setVisible(false);
		btn_TopDeconnexion.setDisable(false);
	}

	/**
	 * 
	 */
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

	/**
	 * 
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO

	}

}
