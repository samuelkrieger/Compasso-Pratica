package com.compasso.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.common.base.Function;

@Entity
@Table(name= "pessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private long cpf;
	
	public <R> R map(Function<Pessoa, R>function) {
		return function.apply(this);
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Pessoa() {

	}

	public Pessoa(String nome,long cpf) {
		this.nome = nome;
		this.cpf=cpf;
	}

	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	public long getCpf() {
		return cpf;
	}
	
	
	

}
