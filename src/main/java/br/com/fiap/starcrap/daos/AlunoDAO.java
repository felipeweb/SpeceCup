package br.com.fiap.starcrap.daos;

import br.com.fiap.starcrap.models.Aluno;
import java.util.List;

import javax.persistence.EntityManager;

/**
 * Created by felipeweb on 10/9/15.
 */
public class AlunoDAO extends GenericDAO<Aluno> {
	private EntityManager manager;

	public AlunoDAO(EntityManager manager) {
		super(Aluno.class);
		this.manager = manager;
	}

	@Override
	protected EntityManager getEntityManager() {
		return manager;
	}
}
