package br.com.fiap.starcrap.models;

import javax.persistence.*;
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
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@NotNull
	private LocalDateTime dataDoLancamento;
	@NotNull
	private BigDecimal velocidadeDoVento;
	private BigDecimal altitudeMaxima;
	private BigDecimal velocidadeMaxima;
	private Duration tempoDePropulsao;
	private BigDecimal picoDeAceleracao;
	private BigDecimal aceleracaoMedia;
	private Duration tempoEntreApogeu;//EDescida
	private Duration tempoDeEjecao;
	private BigDecimal altitudeDeEjecao;
	private BigDecimal taxaDeDescida;
	private Duration duracaoDoVoo;
	@NotNull
	@OneToOne
	private Foguete foguete;

        public Lancamento() {
		this(null, null, null, null, null, null, null, null, null, null, null, null, null);
	}

	public Lancamento(LocalDateTime dataDoLancamento,
					  BigDecimal velocidadeDoVento,
					  BigDecimal altitudeMaxima,
					  BigDecimal velocidadeMaxima,
					  Duration tempoDePropulsao,
					  BigDecimal picoDeAceleracao,
					  BigDecimal aceleracaoMedia,
					  Duration tempoEntreApogeu,
					  Duration tempoDeEjecao,
					  BigDecimal altitudeDeEjecao,
					  BigDecimal taxaDeDescida,
					  Duration duracaoDoVoo,
					  Foguete foguete) {
		this.dataDoLancamento = dataDoLancamento;
		this.velocidadeDoVento = velocidadeDoVento;
		this.altitudeMaxima = altitudeMaxima;
		this.velocidadeMaxima = velocidadeMaxima;
		this.tempoDePropulsao = tempoDePropulsao;
		this.picoDeAceleracao = picoDeAceleracao;
		this.aceleracaoMedia = aceleracaoMedia;
		this.tempoEntreApogeu = tempoEntreApogeu;
		this.tempoDeEjecao = tempoDeEjecao;
		this.altitudeDeEjecao = altitudeDeEjecao;
		this.taxaDeDescida = taxaDeDescida;
		this.duracaoDoVoo = duracaoDoVoo;
		this.foguete = foguete;
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

	public BigDecimal getVelocidadeDoVento() {
		return velocidadeDoVento;
	}

	public void setVelocidadeDoVento(BigDecimal velocidadeDoVento) {
		this.velocidadeDoVento = velocidadeDoVento;
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
		return tempoEntreApogeu;
	}

	public void setTempoEntreApogeu(Duration tempoEntreApogeu) {
		this.tempoEntreApogeu = tempoEntreApogeu;
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

	public Foguete getFoguete() {
		return foguete;
	}

	public void setFoguete(Foguete foguete) {
		this.foguete = foguete;
	}
}