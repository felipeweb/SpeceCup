package br.com.fiap.starcrap.daos;

import br.com.fiap.starcrap.models.Lancamento;

import javax.persistence.EntityManager;

/**
 * Created by felipeweb on 10/9/15.
 */
public class LancamentoDAO extends GenericDAO<Lancamento> {

	private EntityManager manager;

	public LancamentoDAO(EntityManager manager) {
		super(Lancamento.class);
		this.manager = manager;
	}

	@Override
	protected EntityManager getEntityManager() {
		return manager;
	}
}
