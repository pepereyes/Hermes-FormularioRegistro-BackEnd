package com.solser.hermes.eventos.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name = "REGISTROEVENTO")
public class RegistroEvento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRegistro;
	@Column(columnDefinition="int")
	private int idEvento;
	@Column(columnDefinition="varchar")
	private String nombre;
	@Column(columnDefinition="varchar")
	private String apellido;
	@Column(columnDefinition="varchar")
	private String correo;
	@Column(columnDefinition="varchar")
	private String telefono;
	@Column(columnDefinition="varchar")
	private String evento;
	@Column(columnDefinition="datetime")
	private Date fecha;
}
