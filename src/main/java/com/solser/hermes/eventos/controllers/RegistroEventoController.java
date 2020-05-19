package com.solser.hermes.eventos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.solser.hermes.eventos.PruebaPojo;
import com.solser.hermes.eventos.entities.RegistroEvento;
import com.solser.hermes.eventos.services.RegistroEventoService;


@RestController
@CrossOrigin
public class RegistroEventoController {
	@Autowired
	RegistroEventoService service;
	@PostMapping(path="/crear",consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RegistroEvento> crear(@RequestBody RegistroEvento re) {
		ResponseEntity<RegistroEvento> result = new ResponseEntity<RegistroEvento>(service.alta(re),HttpStatus.OK);
		return result;
	}
	@GetMapping("/all")
	public ResponseEntity<List<RegistroEvento>> all() {
		return new ResponseEntity<List<RegistroEvento>>(service.consulta(),HttpStatus.OK);
	}
}
