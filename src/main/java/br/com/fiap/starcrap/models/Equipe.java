package br.com.fiap.starcrap.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * Created by felipeweb on 10/5/15.
 */
@Entity
public class Equipe {
	@Id
	private String nome;
	@NotNull
	private String turma;
	@NotNull
	private LocalDateTime dataLancamento;

	public Equipe(String nome, String turma, LocalDateTime dataLancamento) {
		this.nome = nome;
		this.turma = turma;
		this.dataLancamento = dataLancamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public LocalDateTime getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDateTime dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
}
