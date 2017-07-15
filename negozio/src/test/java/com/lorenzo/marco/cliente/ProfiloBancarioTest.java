package com.lorenzo.marco.cliente;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lorenzo.marco.database.Database;

public class ProfiloBancarioTest {

	private ProfiloBancarioCliente profiloBancarioCliente;
	private Cliente cliente;
	private Database database;

	@Test
	public void testGetIdConto() {
		this.cliente = new Cliente("Marco", "Vignini", "nick", "pass", database);
		this.profiloBancarioCliente = new ProfiloBancarioCliente(cliente, 123456789, 3000);
		assertEquals(123456789, this.profiloBancarioCliente.getIdConto());
	}

	@Test
	public void testGetSaldo() {
		this.cliente = new Cliente("Marco", "Vignini", "nick", "pass", database);
		this.profiloBancarioCliente = new ProfiloBancarioCliente(cliente, 123456789, 3000);
		assertEquals(3000, this.profiloBancarioCliente.getSaldo(), 0);
	}

	@Test
	public void testGetClient() {
		this.cliente = new Cliente("Marco", "Vignini", "nick", "pass", database);
		this.profiloBancarioCliente = new ProfiloBancarioCliente(cliente, 123456789, 400);
		assertEquals(this.profiloBancarioCliente.getCliente().getNome(), this.cliente.getNome());
		assertEquals(this.profiloBancarioCliente.getCliente().getCognome(), this.cliente.getCognome());
		assertTrue(this.cliente.equals(this.profiloBancarioCliente.getCliente()));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testClienteNull() {
		this.cliente = new Cliente("Marco", "Vignini", "nick", "pass", database);
		this.profiloBancarioCliente = new ProfiloBancarioCliente(null, 12345, 345);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIdContoNonAmmissibile() {
		this.cliente = new Cliente("Marco", "Vignini", "nick", "pass", database);
		this.profiloBancarioCliente = new ProfiloBancarioCliente(cliente, 0, 43432);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSaldoNonAmmissibile() {
		this.cliente = new Cliente("Marco", "Vignini", "nick", "pass", database);
		this.profiloBancarioCliente = new ProfiloBancarioCliente(cliente, 1, 0);
	}

}
