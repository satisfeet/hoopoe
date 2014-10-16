package com.satisfeet.core;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class CustomerRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Customer> findAll() {
        CriteriaQuery<Customer> criteria = em.getCriteriaBuilder()
            .createQuery(Customer.class);

        return em.createQuery(criteria).getResultList();
    }

    public Customer findById(Integer id) {
        return em.find(Customer.class, id);
    }

}
