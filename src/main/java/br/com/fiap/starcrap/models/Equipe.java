package br.com.fiap.starcrap.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
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
	private LocalDateTime dataLancamento;
	@NotNull
	@OneToMany
	private List<Aluno> alunos;

	/**
	 * @deprecated JPA eyes only
	 */
	protected Equipe() {
		this(null, null, null, null);
	}

	public Equipe(String nome, String turma, LocalDateTime dataLancamento, List<Aluno> alunos) {
		this.nome = nome;
		this.turma = turma;
		this.dataLancamento = dataLancamento;
		this.alunos = alunos;
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

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
}
