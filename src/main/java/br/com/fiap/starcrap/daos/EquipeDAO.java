package br.com.fiap.starcrap.daos;

import br.com.fiap.starcrap.models.Equipe;

import javax.persistence.EntityManager;

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
}
