package com.unitaire.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TarifTest {

	@Test
	void testTarif() {
		int temps = 0;
		
		Tarif tarif = new Tarif();
		//Act
		double TestTarif = tarif.Tarrif(temps);
		
		assertEquals(0, TestTarif);
		temps = 20;
		double TestTarif1 = tarif.Tarrif(temps);
		assertEquals(0.5, TestTarif1);
		temps = 40;
		double TestTarif2 = tarif.Tarrif(temps);
		assertEquals(1, TestTarif2);
		temps = 75;
		double TestTarif3 = tarif.Tarrif(temps);
		assertEquals(1.5, TestTarif3);
		temps = 90;
		double TestTarif4 = tarif.Tarrif(temps);
		assertEquals(2, TestTarif4);
	}
}