package com.unitaire.test;

public class Tarif {
		int heureD;	
		int heureA;		
		double cout = 0;
		int temps = heureD - heureA;
		

		public double Tarrif(int temps) {
			if(temps <= 15) {
				cout = 0;
				return cout;
			} else if (temps <= 30){
				cout = 0.5;
				return cout;
			} else if (temps <= 60){
				cout = 1;
				return cout;
			} else {
				// cout fixe d'une heure
				cout = 1;
				temps -= 60;
				// + tous les 1/4 h commencés
				long nbquarts, reste;
				nbquarts = temps / 15;
				reste = temps % 15;
				if (reste != 0)
					nbquarts++;
				cout += nbquarts * 0.5;
				return cout;
			}
		}
}
