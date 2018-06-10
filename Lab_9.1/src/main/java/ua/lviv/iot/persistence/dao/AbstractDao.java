package ua.lviv.iot.persistence.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public abstract class AbstractDao<T> implements IDao<T> {

    @PersistenceContext
    private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    protected abstract Class<T> getEntityClass();

    @Transactional(value = Transactional.TxType.REQUIRED)
    @Override
    public T findById(Integer id) {
        T result = (T) entityManager.find(getEntityClass(), id);
        return result;
    }

    @Transactional(value = Transactional.TxType.REQUIRED)
    @Override
    public T persist(T object) {
        entityManager.persist(object);
        return object;
    }

    @Transactional(value = Transactional.TxType.REQUIRED)
    @Override
    public boolean delete(Integer id){
        entityManager.remove(entityManager.find(getEntityClass(), id));
        return true;
    }

    @Transactional(value = Transactional.TxType.REQUIRED)
    @Override
    public T updateObject( T object){
      T entityToUpdate =  entityManager.merge(object);
      entityManager.persist(entityToUpdate);
        return object;
    }
}
