package com.lorenzo.marco.prodotti;

public class ProdottoGenericoTest {
	
	protected ProdottoSingolo prodotto;
	
	protected ProdottoSingolo creazioneProdottoSingolo(String nome, double prezzo, String descrizione) {
		return new ProdottoSingolo(nome, prezzo, descrizione);
	}

}
