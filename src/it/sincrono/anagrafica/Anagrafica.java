package it.sincrono.anagrafica;

import java.util.Date;

public class Anagrafica {

	private String nominativo;
	private Date dataNascita;
	private String cittaNascita;

	public String getNominativo() {
		return nominativo;
	}

	public Anagrafica setNominativo(String nominativo) {
		this.nominativo = nominativo;
		return this;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public Anagrafica setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
		return this;
	}

	public String getCittaNascita() {
		return cittaNascita;
	}

	public Anagrafica setCittaNascita(String cittaNascita) {
		this.cittaNascita = cittaNascita;
		return this;
	}

}
