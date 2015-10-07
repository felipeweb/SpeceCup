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
	@NotNull
	private BigDecimal distanciaDoAlvo;
	@NotNull
	private BigDecimal alguloDeLancamento;
	@NotNull
	private BigDecimal pesoDoFoguete;

	/**
	 * @deprecated JPA eyes only
	 */
	protected Foguete() {
		this(null, null, null);
	}

	public Foguete(BigDecimal distanciaDoAlvo, BigDecimal alguloDeLancamento, BigDecimal pesoDoFoguete) {
		this.distanciaDoAlvo = distanciaDoAlvo;
		this.alguloDeLancamento = alguloDeLancamento;
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

	public BigDecimal getAlguloDeLancamento() {
		return alguloDeLancamento;
	}

	public void setAlguloDeLancamento(BigDecimal alguloDeLancamento) {
		this.alguloDeLancamento = alguloDeLancamento;
	}

	public BigDecimal getPesoDoFoguete() {
		return pesoDoFoguete;
	}

	public void setPesoDoFoguete(BigDecimal pesoDoFoguete) {
		this.pesoDoFoguete = pesoDoFoguete;
	}
}
