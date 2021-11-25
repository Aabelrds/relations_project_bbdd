package com.springBoot.apiRest.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dni")
public class Dni{
	
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String dniString;
	
	@OneToOne
	@JoinColumn(name = "persona_id")
	private Persona persona;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	
	
}
