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

	private Prodotto creazioneProdotto(String nome, double prezzo, String descrizione) {
		return new Prodotto(nome, prezzo, descrizione);
	}

}
