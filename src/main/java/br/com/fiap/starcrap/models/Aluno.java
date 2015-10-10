package br.com.fiap.starcrap.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by felipeweb on 10/6/15.
 */
@Entity
public class Aluno {
	@Id
	private String rm;
	@NotNull
	private String nome;

       
	public Aluno() {
		this(null, null);
	}

	public Aluno(String rm, String nome) {
		this.rm = rm;
		this.nome = nome;
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
