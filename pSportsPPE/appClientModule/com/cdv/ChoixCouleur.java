package com.cdv;

public class ChoixCouleur {
	private Couleur couleur;

	public ChoixCouleur(final double etat) {
		couleur = Couleur.rouge;
	}
	
	public Couleur getCouleur() {
		return couleur;
	}
}