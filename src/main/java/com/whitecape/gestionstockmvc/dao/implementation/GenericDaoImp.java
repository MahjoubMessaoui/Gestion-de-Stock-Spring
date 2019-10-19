package com.whitecape.gestionstockmvc.dao.implementation;

import com.whitecape.gestionstockmvc.dao.IgenericDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
@SuppressWarnings("unchecked")
public class GenericDaoImp<E> implements IgenericDao {
    @PersistenceContext
    EntityManager em;
    private Class < E > type;

    public Class < E > getType() {
        return type;
    }


    public GenericDaoImp() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class < E >) pt.getActualTypeArguments()[0];

    }


    @Override
    public Object save(Object entity) {
        em.persist(entity);
        return entity;
    }

    @Override
    public Object update(Object entity) {
        return em.merge(entity);
    }

    @Override
    public List selectAll() {
        Query query = em.createQuery("select t from " + type.getSimpleName() + "t");
        return query.getResultList();
    }

    @Override
    public List selectAll(String sortfield, String sort) {
        Query query = em.createQuery("select t from" + type.getSimpleName() + "t order by" + sortfield + " " + sort);
        return query.getResultList();
    }

    @Override
    public Object getById(Long id) {
        return em.find(type, id);
    }

    @Override
    public void remove(Long id) {
        E tab = em.getReference(type, id);
        em.remove(tab);
    }

    @Override
    public Object findOne(String paramName, Object paramValue) {
        Query query = em.createQuery("select t from" + type.getSimpleName() + "t where " + paramName + "= :x");
        query.setParameter(paramName, paramValue);
        return query.getResultList().size() > 0 ? (E) query.getResultList().get(0) : null;
/* autrement

       if(query.getResultList().size()>0)
    {  return (E) query.getResultList.get(0);
 }
 return null;

*/
    }

    @Override
    public Object findOne(String[] paramName, Object[] paramValue) {
        // test 3la longeur de deux tableaux coomme si paramName fi tab1 et paramValue fi tab2
        //bech ki na3mel recherche ya3mel 3la paramName fi tab1 et paramValue fi tab2
        if (paramName.length != paramValue.length) {
            return null;
        }
        String queryString = "select e from " + type.getSimpleName() + "e where ";
        int len = paramName.length;
        for (int i = 0; i < len; i++) {
            queryString += "e," + paramName[i] + "= :x" + i;
            if ((i + 1) < len) {
                queryString += " and ";
            }
        }
        Query query = em.createQuery(queryString);
        for (int i = 0; i < paramValue.length; i++) {
            query.setParameter("x" + i, paramValue[i]);
        }
        return query.getResultList().size() > 0 ? (E) query.getResultList().get(0) : null;
    }

    @Override
    public int findCountBy(String paramName, String paramValue) {
        Query query = em.createQuery("select t from" + type.getSimpleName() + "t where " + paramName + "= :x");
        query.setParameter(paramName, paramValue);
        return query.getResultList().size() > 0 ? ((Long) query.getSingleResult()).intValue() : 0;
    }

}