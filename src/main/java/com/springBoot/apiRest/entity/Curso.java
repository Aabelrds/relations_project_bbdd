package com.springBoot.apiRest.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {

	@Id
	Long id;
	@ManyToMany
	Set<Student> student;
}
