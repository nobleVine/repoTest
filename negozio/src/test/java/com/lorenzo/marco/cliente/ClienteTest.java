package com.lorenzo.marco.cliente;

import static org.junit.Assert.*;

import java.net.UnknownHostException;

import org.junit.*;
import static org.mockito.Mockito.*;

import com.lorenzo.marco.database.Database;

public class ClienteTest {

	private Cliente cliente;

	private Database database;

	@Before
	public void setUp() throws UnknownHostException {
		database = mock(Database.class);
	}

	@Test
	public void testNome() {
		this.cliente = creazioneCliente("Marco", "Vignini", "nick", "pass", database);
		assertEquals("Marco", this.cliente.getNome());
	}

	@Test
	public void testCognome() {
		this.cliente = creazioneCliente("Marco", "Vignini", "", "", database);
		assertEquals("Vignini", this.cliente.getCognome());
	}

	private Cliente creazioneCliente(String nome, String cognome, String nickname, String password, Database database) {
		return new Cliente(nome, cognome, nickname, password, database);
	}

}