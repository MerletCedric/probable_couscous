package com.unitaire.test;

public class ChoixCouleur {
	public int a;
	public String Couleur;
	
	
	public String ChoixCouleurTest(double a) {
		if (a == 1) {
			Couleur = "Rouge";
			return Couleur;
		} else if (a < 0.70) {
			Couleur = "Vert";
			return Couleur;
		} else {
			Couleur = "Orange";
			return Couleur;
		}
}
}