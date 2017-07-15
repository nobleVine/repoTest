package com.lorenzo.marco.prodotti;

import org.junit.*;

public class ProdottoGenericoTest {
	
	protected ProdottoSingolo prodotto;

	@Before
	public void setUp() {
		prodotto = creazioneProdottoSingolo("Maglietta", 50, "Maglietta basket");
		System.out.println("Creazione prodotto");
	}
	
	protected ProdottoSingolo creazioneProdottoSingolo(String nome, double prezzo, String descrizione) {
		return new ProdottoSingolo(nome, prezzo, descrizione);
	}

}
