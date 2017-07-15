package com.lorenzo.marco.prodotti;

import static org.junit.Assert.*;

import org.junit.*;

public class ProdottoTest {

	private Prodotto prodotto;

	@Test
	public void testNome() {
		prodotto = creazioneProdotto("Maglietta", 50, "Maglietta basket");
		assertEquals("Maglietta", prodotto.getNome());
	}

	@Test
	public void testPrezzo() {
		prodotto = creazioneProdotto("Maglietta", 50, "Maglietta basket");
		assertEquals(50, prodotto.getPrezzo(), 0);
	}

	@Test
	public void testDescrizione() {
		prodotto = creazioneProdotto("Maglietta", 1, "Maglietta basket");
		assertEquals("Maglietta basket", prodotto.getDescrizione());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInputNegativo() {
		prodotto = creazioneProdotto("Maglietta", -9, "Maglietta basket");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNomeNonVuoto() {
		prodotto = creazioneProdotto(null, 5, "Maglietta basket");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDescrizioneNonVuoto() {
		prodotto = creazioneProdotto("Maglietta", 5, "");
	}

	@Test
	public void testTipoNome() {
		prodotto = creazioneProdotto("Maglietta", 1, "Maglietta basket");
		assertTrue(prodotto.getNome() instanceof String);
	}

	/*
	 * @Test public void testTipoPrezzo() { prodotto =
	 * creazioneProdotto("Maglietta", 1, "Maglietta basket");
	 * assertTrue(prodotto.getPrezzo() ); }
	 */

	@Test
	public void testTipoDescrizione() {
		prodotto = creazioneProdotto("Maglietta", 1, "Maglietta basket");
		assertTrue(prodotto.getDescrizione() instanceof String);
	}

	private Prodotto creazioneProdotto(String nome, double prezzo, String descrizione) {
		return new Prodotto(nome, prezzo, descrizione);
	}

}
