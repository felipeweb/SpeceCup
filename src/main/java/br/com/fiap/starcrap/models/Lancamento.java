package br.com.fiap.starcrap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Created by felipeweb on 10/6/15.
 */
@Entity
public class Lancamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private LocalDateTime dataDoLancamento;
	@NotNull
	private BigDecimal distanciaDoAlvo;
	@NotNull
	private BigDecimal alguloDeLancamento;
	@NotNull
	private BigDecimal velocidadeDoVento;
	@NotNull
	private BigDecimal pesoDoFoguete;
	private BigDecimal altitudeMaxima;
	private BigDecimal velocidadeMaxima;
	private Duration tempoDePropulsao;
	private BigDecimal picoDeAceleracao;
	private BigDecimal aceleracaoMedia;
	private Duration tempoEntreApogeuEDescida;
	private Duration tempoDeEjecao;
	private BigDecimal altitudeDeEjecao;
	private BigDecimal taxaDeDescida;
	private Duration duracaoDoVoo;

	protected Lancamento() {
		this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
	}

	public Lancamento(LocalDateTime dataDoLancamento,
					  BigDecimal distanciaDoAlvo,
					  BigDecimal alguloDeLancamento,
					  BigDecimal velocidadeDoVento,
					  BigDecimal pesoDoFoguete,
					  BigDecimal altitudeMaxima,
					  BigDecimal velocidadeMaxima,
					  Duration tempoDePropulsao,
					  BigDecimal picoDeAceleracao,
					  BigDecimal aceleracaoMedia,
					  Duration tempoEntreApogeuEDescida,
					  Duration tempoDeEjecao,
					  BigDecimal altitudeDeEjecao,
					  BigDecimal taxaDeDescida,
					  Duration duracaoDoVoo) {
		this.dataDoLancamento = dataDoLancamento;
		this.distanciaDoAlvo = distanciaDoAlvo;
		this.alguloDeLancamento = alguloDeLancamento;
		this.velocidadeDoVento = velocidadeDoVento;
		this.pesoDoFoguete = pesoDoFoguete;
		this.altitudeMaxima = altitudeMaxima;
		this.velocidadeMaxima = velocidadeMaxima;
		this.tempoDePropulsao = tempoDePropulsao;
		this.picoDeAceleracao = picoDeAceleracao;
		this.aceleracaoMedia = aceleracaoMedia;
		this.tempoEntreApogeuEDescida = tempoEntreApogeuEDescida;
		this.tempoDeEjecao = tempoDeEjecao;
		this.altitudeDeEjecao = altitudeDeEjecao;
		this.taxaDeDescida = taxaDeDescida;
		this.duracaoDoVoo = duracaoDoVoo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataDoLancamento() {
		return dataDoLancamento;
	}

	public void setDataDoLancamento(LocalDateTime dataDoLancamento) {
		this.dataDoLancamento = dataDoLancamento;
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

	public BigDecimal getVelocidadeDoVento() {
		return velocidadeDoVento;
	}

	public void setVelocidadeDoVento(BigDecimal velocidadeDoVento) {
		this.velocidadeDoVento = velocidadeDoVento;
	}

	public BigDecimal getPesoDoFoguete() {
		return pesoDoFoguete;
	}

	public void setPesoDoFoguete(BigDecimal pesoDoFoguete) {
		this.pesoDoFoguete = pesoDoFoguete;
	}

	public BigDecimal getAltitudeMaxima() {
		return altitudeMaxima;
	}

	public void setAltitudeMaxima(BigDecimal altitudeMaxima) {
		this.altitudeMaxima = altitudeMaxima;
	}

	public BigDecimal getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(BigDecimal velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public Duration getTempoDePropulsao() {
		return tempoDePropulsao;
	}

	public void setTempoDePropulsao(Duration tempoDePropulsao) {
		this.tempoDePropulsao = tempoDePropulsao;
	}

	public BigDecimal getPicoDeAceleracao() {
		return picoDeAceleracao;
	}

	public void setPicoDeAceleracao(BigDecimal picoDeAceleracao) {
		this.picoDeAceleracao = picoDeAceleracao;
	}

	public BigDecimal getAceleracaoMedia() {
		return aceleracaoMedia;
	}

	public void setAceleracaoMedia(BigDecimal aceleracaoMedia) {
		this.aceleracaoMedia = aceleracaoMedia;
	}

	public Duration getTempoEntreApogeuEDescida() {
		return tempoEntreApogeuEDescida;
	}

	public void setTempoEntreApogeuEDescida(Duration tempoEntreApogeuEDescida) {
		this.tempoEntreApogeuEDescida = tempoEntreApogeuEDescida;
	}

	public Duration getTempoDeEjecao() {
		return tempoDeEjecao;
	}

	public void setTempoDeEjecao(Duration tempoDeEjecao) {
		this.tempoDeEjecao = tempoDeEjecao;
	}

	public BigDecimal getAltitudeDeEjecao() {
		return altitudeDeEjecao;
	}

	public void setAltitudeDeEjecao(BigDecimal altitudeDeEjecao) {
		this.altitudeDeEjecao = altitudeDeEjecao;
	}

	public BigDecimal getTaxaDeDescida() {
		return taxaDeDescida;
	}

	public void setTaxaDeDescida(BigDecimal taxaDeDescida) {
		this.taxaDeDescida = taxaDeDescida;
	}

	public Duration getDuracaoDoVoo() {
		return duracaoDoVoo;
	}

	public void setDuracaoDoVoo(Duration duracaoDoVoo) {
		this.duracaoDoVoo = duracaoDoVoo;
	}
}