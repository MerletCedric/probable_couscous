package com.pSportPPE.app;

import com.keepautomation.barcode.*;
public class RunComplexe {
	private static int nbMuscu = 4;
	private static int nbFit = 5;
	private static final String nomComplexe = "C Fun";
	private static final String TYPE = "Type opération (E)ntrée ou (S)ortie : ";
	private static final String SORTIE = "N° d'entrée à sortir : ";
	private static final String CHOIX = "(M)usculation, (F)itness : ";
	private static final String AUTRE = "Autre opération (O/N) : ";
	
	public static void main(String[] args) {
		Complexe leComplexe = new Complexe(nbMuscu, nbFit, nomComplexe);
		
		char repAutre = 'O';
		char repType;
		int repSortie;
		char repChoix;
		
		while (repAutre == 'O') {
			repType = Character.toUpperCase(javax.swing.JOptionPane.showInputDialog(TYPE).charAt(0));
			if (repType == 'E') {
				repChoix = Character.toUpperCase(javax.swing.JOptionPane.showInputDialog(CHOIX).charAt(0));
				Arrivee jArrive = new Arrivee(leComplexe, repChoix);
				if (leComplexe.entreeUsager(jArrive)) {
					System.out.println(jArrive.afficheBillet());
				}
			}
			else{
				repSortie = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(SORTIE));
				System.out.println(leComplexe.sortieUsager(repSortie).afficheTicket());
			}
			System.out.print(leComplexe.lesInfos());
			repAutre = Character.toUpperCase(javax.swing.JOptionPane.showInputDialog(AUTRE).charAt(0));
		}

		// création du code barre
		BarCode ean13 = new BarCode();

		ean13.setCodeToEncode("123456789999");
		ean13.setSymbology(IBarCode.EAN13);
		ean13.setX(2);
		ean13.setY(50);
		ean13.setRightMargin(0);
		ean13.setLeftMargin(0);
		ean13.setTopMargin(0);
		ean13.setBottomMargin(0);

		try
		{
			// choisir le répertoire et le nom de l'image ainsi que son format
			ean13.draw("c://ean13.gif");

		}
		catch (Exception e) {
			e.printStackTrace();
		}

		System.exit(0);	
	}
}
