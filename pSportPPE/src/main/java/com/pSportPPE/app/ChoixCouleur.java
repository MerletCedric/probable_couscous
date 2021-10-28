package com.pSportPPE.app;

public class ChoixCouleur {
	private Couleur couleur;

	public ChoixCouleur(final double etat) {
		if (etat == 1) {
			couleur = Couleur.rouge;
			} else if (etat < 0.7) {
				couleur = Couleur.vert;
			} else {
				couleur = Couleur.orange;
			}
		}
	
	public Couleur getCouleur() {
		return couleur;
	}
}