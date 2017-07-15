package com.lorenzo.marco.cliente;

import com.lorenzo.marco.banca.Banca;
import com.lorenzo.marco.carrello.Carrello;

public class ProfiloBancarioCliente {

	private Cliente cliente;
	private int idConto;
	private double saldo;
	private Banca banca;
	private Carrello carrello;
	
	public ProfiloBancarioCliente(Cliente cliente, int idConto, int saldo, Banca banca){
		this.controlloParametri(cliente, idConto, saldo);
		this.banca = banca;
		this.carrello = new Carrello();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getIdConto() {
		return idConto;
	}

	public double getSaldo() {
		return saldo;
	}
		
	private void controlloParametri(Cliente cliente, int idConto, int saldo) {
		if (cliente == null || idConto <= 0 || saldo <= 0)
			throw new IllegalArgumentException("Nessun parametro del conto bancario può essere null o minore uguale di zero");
		this.cliente = cliente;
		this.idConto = idConto;
		this.saldo = saldo;
	}

	public String faiAcquisto() {
		return this.banca.pagamento(this.getIdConto(), this.carrello.spesaTotale());
	}

	public Carrello getCarrello() {
		return carrello;
	}

}
