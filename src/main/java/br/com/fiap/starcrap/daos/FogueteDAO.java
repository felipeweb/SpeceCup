package br.com.fiap.starcrap.daos;

import br.com.fiap.starcrap.models.Foguete;

import javax.persistence.EntityManager;

/**
 * Created by felipeweb on 10/9/15.
 */
public class FogueteDAO extends GenericDAO<Foguete> {

	private EntityManager manager;

	public FogueteDAO(EntityManager manager) {
		super(Foguete.class);
		this.manager = manager;
	}

	@Override
	protected EntityManager getEntityManager() {
		return manager;
	}
}
