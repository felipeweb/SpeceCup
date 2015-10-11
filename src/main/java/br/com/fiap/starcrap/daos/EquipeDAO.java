package br.com.fiap.starcrap.daos;

import br.com.fiap.starcrap.models.Equipe;

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
        } catch(NoResultException e) {
            return null;
        }
    }
}
