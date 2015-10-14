package br.com.fiap.starcrap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Created by felipeweb on 10/7/15.
 */
@Entity
public class Foguete {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal distanciaDoAlvo;
	@NotNull
	private BigDecimal anguloDeLancamento;
	@NotNull
	private BigDecimal pesoDoFoguete;

	
	public Foguete() {
		this(null, null, null);
	}

	public Foguete(BigDecimal distanciaDoAlvo, BigDecimal anguloDeLancamento, BigDecimal pesoDoFoguete) {
		this.distanciaDoAlvo = distanciaDoAlvo;
		this.anguloDeLancamento = anguloDeLancamento;
		this.pesoDoFoguete = pesoDoFoguete;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getDistanciaDoAlvo() {
		return distanciaDoAlvo;
	}

	public void setDistanciaDoAlvo(BigDecimal distanciaDoAlvo) {
		this.distanciaDoAlvo = distanciaDoAlvo;
	}

	public BigDecimal getAnguloDeLancamento() {
		return anguloDeLancamento;
	}

	public void setAnguloDeLancamento(BigDecimal anguloDeLancamento) {
		this.anguloDeLancamento = anguloDeLancamento;
	}

	public BigDecimal getPesoDoFoguete() {
		return pesoDoFoguete;
	}

	public void setPesoDoFoguete(BigDecimal pesoDoFoguete) {
		this.pesoDoFoguete = pesoDoFoguete;
	}
}
