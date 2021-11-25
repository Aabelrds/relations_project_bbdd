package com.springBoot.apiRest.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String nombre;
	
	@OneToOne(mappedBy = "persona")
	private Dni dni;
}
