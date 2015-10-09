package br.com.fiap.starcrap.daos;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by felipeweb on 10/9/15.
 */
public abstract class GenericDAO<T> {

	private final Class<T> entityClass;

	public GenericDAO(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	protected abstract EntityManager getEntityManager();

	public void insert(T entity) {
		getEntityManager().persist(entity);
	}

	public void update(T entity) {
		getEntityManager().merge(entity);
	}

	public void delete(T entity) {
		getEntityManager().remove(getEntityManager().merge(entity));
	}

	public Object findById(Object id) {
		return getEntityManager().find(entityClass, id);
	}


	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		CriteriaQuery<Object> cq = getEntityManager().getCriteriaBuilder()
				.createQuery();
		cq.select(cq.from(entityClass));
		return (List<T>) getEntityManager().createQuery(cq).getResultList();
	}
}
