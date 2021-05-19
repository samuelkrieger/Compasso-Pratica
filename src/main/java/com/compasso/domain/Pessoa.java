package com.compasso.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "pessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String nome;

	
	
	
	public Pessoa() {

	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	
	

}
