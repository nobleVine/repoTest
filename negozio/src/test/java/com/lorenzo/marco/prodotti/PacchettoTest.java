package com.lorenzo.marco.prodotti;

import static org.junit.Assert.*;

import org.junit.*;

public class PacchettoTest {
	private ProdottoSingolo prodotto;
	private ProdottoSingolo prodotto2;
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
	
	@Test
	public void testAggiungiSingoloProdottoAlPacchetto() {
		prodotto = creazioneProdotto("Maglietta", 50, "Maglietta basket");
		pacchetto = creazionePacchetto("Pacchetto", "Pacchetto basket");
		pacchetto.aggiungiProdotto(prodotto);
		assertEquals(1, pacchetto.numProdotti());
		assertEquals("Maglietta", pacchetto.getListaProdottiSingoli().get(0).getNome());
		assertEquals(50, pacchetto.getListaProdottiSingoli().get(0).getPrezzo(), 0);
		assertEquals("Maglietta basket", pacchetto.getListaProdottiSingoli().get(0).getDescrizione());
	}

	@Test
	public void testRimuoviSingoloProdottoAlPacchetto() {
		prodotto = creazioneProdotto("Maglietta", 50, "Maglietta basket");
		pacchetto = creazionePacchetto("Pacchetto", "Pacchetto basket");
		pacchetto.aggiungiProdotto(prodotto);
		pacchetto.rimuoviProdotto(prodotto);
		assertEquals(0, pacchetto.numProdotti());
	}

	@Test(expected = RuntimeException.class)
	public void testRimuoviProdottoDaPacchettoVuoto() {
		prodotto = creazioneProdotto("Maglietta", 50, "Maglietta basket");
		pacchetto = creazionePacchetto("Pacchetto", "Pacchetto basket");
		pacchetto.rimuoviProdotto(prodotto);
	}

	@Test
	public void testGetPrezzoPacchettoConPiuDiUnProdotto() {
		prodotto = creazioneProdotto("Maglietta", 50, "Maglietta basket");
		prodotto2 = creazioneProdotto("Pantaloncini", 50, "Pantaloncini basket");
		pacchetto = creazionePacchetto("Pacchetto", "Pacchetto basket");
		pacchetto.aggiungiProdotto(prodotto);
		pacchetto.aggiungiProdotto(prodotto2);
		assertEquals(100, pacchetto.getPrezzo(), 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNomeNonVuoto() {
		pacchetto = creazionePacchetto(null, "Pacchetto basket");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDescrizioneNonVuoto() {
		pacchetto = creazionePacchetto("Pacchetto", "");
	}
	
	@Test
	public void testControlloPrezzo() {
		pacchetto = creazionePacchetto("Pacchetto", "Pacchetto basket");
		double prezzo = 0;
		pacchetto.controlloPrezzo(prezzo);
	}
	private ProdottoSingolo creazioneProdotto(String nome, double prezzo, String descrizione) {
		return new ProdottoSingolo(nome, prezzo, descrizione);
	}


	private Pacchetto creazionePacchetto(String nome, String descrizione) {
		return new Pacchetto(nome, descrizione);
	}
}
