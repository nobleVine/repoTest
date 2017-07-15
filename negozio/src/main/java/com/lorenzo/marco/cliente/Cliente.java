
package com.lorenzo.marco.cliente;

import com.lorenzo.marco.database.Database;

public class Cliente {

	private String nome;
	private String cognome;
	private String password;
	private String nickname;

	private Database database;

	public Cliente(String nome, String cognome, String nickname, String password, Database database) {
		controlloParametriDiInizializzazioneCliente(nome, cognome, nickname, password);
		this.database = database;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}
	
	private String getPassword() {
		return password;
	}

	private String getNickname() {
		return nickname;
	}

	private void controlloParametriDiInizializzazioneCliente(String nome, String cognome, String nickname,
			String password) {
		if (nome != "" && nome != null) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("Il nome del cliente non può essere vuoto");
		}

		if (cognome != "" && cognome != null) {
			this.cognome = cognome;
		} else {
			throw new IllegalArgumentException("Il cognome del cliente non può essere vuoto");
		}

		if (nickname != null && password != null) {
			this.nickname = nickname;
			this.password = password;
		} else {
			throw new IllegalArgumentException("nickname e password non possono essere null");
		}

	}
}