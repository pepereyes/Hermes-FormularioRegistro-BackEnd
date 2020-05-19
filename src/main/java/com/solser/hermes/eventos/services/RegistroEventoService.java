package com.solser.hermes.eventos.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solser.hermes.eventos.entities.RegistroEvento;
import com.solser.hermes.eventos.repositories.RegistroEventoRepository;

@Service
public class RegistroEventoService implements RegistroEventoServiceInterface{
	@Autowired
	RegistroEventoRepository repository;
	
	@Override
	public RegistroEvento alta(RegistroEvento re) {
		re.setFecha(new Date());
		return repository.save(re);
	}

	@Override
	public void baja(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RegistroEvento modificacion(RegistroEvento re) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegistroEvento consulta(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RegistroEvento> consulta() {
		return repository.findAll();
	}

}
