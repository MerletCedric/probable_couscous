package com.unitaire.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChoixCouleurTest {

	@Test
	void testCouleur() {
		double a = 0.80;
		
		ChoixCouleur choixcouleur = new ChoixCouleur();
		//Act
		
		String testA = choixcouleur.ChoixCouleurTest(a);
		
		//Assert
		assertEquals("Orange", testA);
		a = 1;
		testA = choixcouleur.ChoixCouleurTest(a);
		assertEquals("Rouge", testA);
		a = 0.3;
		testA = choixcouleur.ChoixCouleurTest(a);
		assertEquals("Vert", testA);
		
	}

}
