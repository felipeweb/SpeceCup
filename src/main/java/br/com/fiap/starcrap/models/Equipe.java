package br.com.fiap.starcrap.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;

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
	@OneToMany
	private List<Aluno> alunos;

	@OneToMany
	private List<Lancamento> lancamentos;

	public Equipe() {
		this(null, null, null, null);
	}

	public Equipe(String nome, String turma, List<Aluno> alunos, List<Lancamento> lancamentos) {
		this.nome = nome;
		this.turma = turma;
		this.alunos = alunos;
		this.lancamentos = lancamentos;
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

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}

	public void setLancamentos(List<Lancamento> lancamentos) {
		this.lancamentos = lancamentos;
	}
}
