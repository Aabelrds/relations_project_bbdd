package com.springBoot.apiRest.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.core.sym.Name;

@Entity
@Table(name = "student")
public class Student {

	
	@Id
	Long id;
	
	private String name;
	
	@ManyToMany
	Set<Curso> cursos;
	
	
}
