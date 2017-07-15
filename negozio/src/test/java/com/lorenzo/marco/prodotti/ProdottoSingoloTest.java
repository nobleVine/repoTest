package com.lorenzo.marco.prodotti;

import static org.junit.Assert.*;

import org.junit.*;

public class ProdottoSingoloTest {

	private ProdottoSingolo prodotto;

	@Test
	public void testNome() {
		prodotto = creazioneProdottoSingolo("Maglietta", 50, "Maglietta basket");
		assertEquals("Maglietta", prodotto.getNome());
	}

	@Test
	public void testPrezzo() {
		prodotto = creazioneProdottoSingolo("Maglietta", 50, "Maglietta basket");
		assertEquals(50, prodotto.getPrezzo(), 0);
	}

	@Test
	public void testDescrizione() {
		prodotto = creazioneProdottoSingolo("Maglietta", 1, "Maglietta basket");
		assertEquals("Maglietta basket", prodotto.getDescrizione());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInputNegativo() {
		prodotto = creazioneProdottoSingolo("Maglietta", -9, "Maglietta basket");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNomeNonVuoto() {
		prodotto = creazioneProdottoSingolo(null, 5, "Maglietta basket");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDescrizioneNonVuoto() {
		prodotto = creazioneProdottoSingolo("Maglietta", 5, "");
	}

	@Test
	public void testTipoNome() {
		prodotto = creazioneProdottoSingolo("Maglietta", 1, "Maglietta basket");
		assertTrue(prodotto.getNome() instanceof String);
	}

	/*
	 * @Test public void testTipoPrezzo() { prodotto =
	 * creazioneProdotto("Maglietta", 1, "Maglietta basket");
	 * assertTrue(prodotto.getPrezzo() ); }
	 */

	@Test
	public void testTipoDescrizione() {
		prodotto = creazioneProdottoSingolo("Maglietta", 1, "Maglietta basket");
		assertTrue(prodotto.getDescrizione() instanceof String);
	}

	private ProdottoSingolo creazioneProdottoSingolo(String nome, double prezzo, String descrizione) {
		return new ProdottoSingolo(nome, prezzo, descrizione);
	}

}
