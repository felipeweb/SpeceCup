package br.com.fiap.starcrap.daos;

import br.com.fiap.starcrap.models.Equipe;
import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

/**
 * Created by felipeweb on 10/9/15.
 */
public class EquipeDAO extends GenericDAO<Equipe> {

	private EntityManager manager;

	public EquipeDAO(EntityManager manager) {
		super(Equipe.class);
		this.manager = manager;
	}

	@Override
	protected EntityManager getEntityManager() {
		return manager;
	}

	public Equipe findByTeamName(String nomeEquipe) {
		try {
			return getEntityManager()
					.createQuery("select e from Equipe e where e.nome = :nome", Equipe.class)
					.setParameter("nome", nomeEquipe)
					.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	public List<Equipe> procuraPorDistanciaDoAlvo(String sinal, String valor) {
		return getEntityManager()
				.createQuery("select e from Equipe e join e.lancamentos l where l.foguete.distanciaDoAlvo" + sinal + ":valor order by l.foguete.distanciaDoAlvo", Equipe.class)
				.setParameter("valor", new BigDecimal(valor))
				.getResultList();
	}

	public List<Equipe> procuraPorAnguloDeLancamento(String sinal, String valor) {
		return getEntityManager()
				.createQuery("select e from Equipe e join e.lancamentos l where l.foguete.anguloDeLancamento" + sinal + ":valor order by l.foguete.anguloDeLancamento", Equipe.class)
				.setParameter("valor", new BigDecimal(valor))
				.getResultList();
	}

	public List<Equipe> procuraPorVelocidadeDoVento(String sinal, String valor) {
		return getEntityManager()
				.createQuery("select e from Equipe e join e.lancamentos l where  l.velocidadeDoVento" + sinal + ":valor order by l.velocidadeDoVento", Equipe.class)
				.setParameter("valor", new BigDecimal(valor))
				.getResultList();
	}


	public List<Equipe> procuraPorPesoDoFoguete(String sinal, String valor) {
		return getEntityManager()
				.createQuery("select e from Equipe e join e.lancamentos l where l.foguete.pesoDoFoguete" + sinal + ":valor order by l.foguete.pesoDoFoguete", Equipe.class)
				.setParameter("valor", new BigDecimal(valor))
				.getResultList();
	}

	public List<Equipe> procuraPorAltitudeMaxima(String sinal, String valor) {
		return getEntityManager()
				.createQuery("select e from Equipe e join e.lancamentos l where l.altitudeMaxima" + sinal + ":valor order by l.altitudeMaxima", Equipe.class)
				.setParameter("valor", new BigDecimal(valor))
				.getResultList();
	}

	public List<Equipe> procuraPorVelocidadeMaxima(String sinal, String valor) {
		return getEntityManager()
				.createQuery("select e from Equipe e join e.lancamentos l where l.velocidadeMaxima" + sinal + ":valor order by l.velocidadeMaxima", Equipe.class)
				.setParameter("valor", new BigDecimal(valor))
				.getResultList();
	}

	public List<Equipe> procuraPorTempoDePropulsao(String sinal, String valor) {
		return getEntityManager()
				.createQuery("select e from Equipe e join e.lancamentos l where l.tempoDePropulsao" + sinal + ":valor order by l.tempoDePropulsao", Equipe.class)
				.setParameter("valor", Duration.ofSeconds(Long.valueOf(valor)))
				.getResultList();
	}

	public List<Equipe> procuraPorPicoDeAceleracao(String sinal, String valor) {
		return getEntityManager()
				.createQuery("select e from Equipe e join e.lancamentos l where l.picoDeAceleracao" + sinal + ":valor order by l.picoDeAceleracao", Equipe.class)
				.setParameter("valor", new BigDecimal(valor))
				.getResultList();
	}

	public List<Equipe> procuraPorAceleracaoMedia(String sinal, String valor) {
		return getEntityManager()
				.createQuery("select e from Equipe e join e.lancamentos l where l.aceleracaoMedia" + sinal + ":valor order by l.aceleracaoMedia", Equipe.class)
				.setParameter("valor", new BigDecimal(valor))
				.getResultList();
	}

	public List<Equipe> procuraPorTempoEntreApogeu(String sinal, String valor) {
		return getEntityManager()
				.createQuery("select e from Equipe e join e.lancamentos l where l.tempoEntreApogeu" + sinal + ":valor order by l.tempoEntreApogeu", Equipe.class)
				.setParameter("valor", Duration.ofSeconds(Long.valueOf(valor)))
				.getResultList();
	}

	public List<Equipe> procuraPorTempoDeEjecao(String sinal, String valor) {
		return getEntityManager()
				.createQuery("select e from Equipe e join e.lancamentos l where l.tempoDeEjecao" + sinal + ":valor order by l.tempoDeEjecao", Equipe.class)
				.setParameter("valor", Duration.ofSeconds(Long.valueOf(valor)))
				.getResultList();
	}

	public List<Equipe> procuraPorAltitudeDeEjecao(String sinal, String valor) {
		return getEntityManager()
				.createQuery("select e from Equipe e join e.lancamentos l where l.altitudeDeEjecao" + sinal + ":valor order by l.altitudeDeEjecao", Equipe.class)
				.setParameter("valor", new BigDecimal(valor))
				.getResultList();
	}

	public List<Equipe> procuraPorTaxaDeDescida(String sinal, String valor) {
		return getEntityManager()
				.createQuery("select e from Equipe e join e.lancamentos l where l.taxaDeDescida" + sinal + ":valor order by l.taxaDeDescida", Equipe.class)
				.setParameter("valor", new BigDecimal(valor))
				.getResultList();
	}

	public List<Equipe> procuraPorDuracaoDoVoo(String sinal, String valor) {
		return getEntityManager()
				.createQuery("select e from Equipe e join e.lancamentos l where l.duracaoDoVoo" + sinal + ":valor order by l.duracaoDoVoo", Equipe.class)
				.setParameter("valor", Duration.ofSeconds(Long.valueOf(valor)))
				.getResultList();
	}
}
