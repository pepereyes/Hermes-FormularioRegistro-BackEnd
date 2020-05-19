package com.solser.hermes.eventos.services;

import java.util.List;

import com.solser.hermes.eventos.entities.RegistroEvento;

public interface RegistroEventoServiceInterface {
	public RegistroEvento alta(RegistroEvento re);
	public void baja(Integer id);
	public RegistroEvento modificacion(RegistroEvento re);
	public RegistroEvento consulta(Integer id);
	public List<RegistroEvento> consulta();
}
