package com.solser.hermes.eventos;

import lombok.Data;


public class PruebaPojo {
	private String dato;
	
	public void setDato(String dato) {
		this.dato = dato;
	}
	
	public String getDato() {
		return dato;
	}
	
	public PruebaPojo() {
		this.dato = "constructor";
	}
	
	public PruebaPojo(String dato) {
		this.dato = dato;
	}
}
