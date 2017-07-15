package com.lorenzo.marco.prodotti;

import static org.junit.Assert.*;

import org.junit.*;

public class PacchettoTest {
	private ProdottoSingolo prodottoSingolo;
	private ProdottoSingolo prodottoSingolo2;
	private Pacchetto pacchetto;

	@Test
	public void testNome() {
		pacchetto = creazionePacchetto("Pacchetto", "Pacchetto basket");
		assertEquals("Pacchetto", pacchetto.getNome());
	}

	@Test
	public void testDescrizione() {
		pacchetto = creazionePacchetto("Pacchetto", "Pacchetto basket");
		assertEquals("Pacchetto basket", pacchetto.getDescrizione());
	}

	@Test
	public void testPacchettoVuoto() {
		pacchetto = creazionePacchetto("Pacchetto", "Pacchetto basket");
		assertEquals(0, pacchetto.numProdotti());
	}

	private Pacchetto creazionePacchetto(String nome, String descrizione) {
		return new Pacchetto(nome, descrizione);
	}
}
