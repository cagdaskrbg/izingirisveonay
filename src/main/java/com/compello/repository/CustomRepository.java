package com.compello.repository;

import com.compello.model.CompelloDate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CustomRepository
{
    @PersistenceContext
    private EntityManager entityManager;

    public List<CompelloDate> getDaysByEmployee(Long employeeId) {
        Query query = entityManager.createNativeQuery("select * from compello.compello_date where employee_id=?", CompelloDate.class);
        query.setParameter(1, employeeId);

        return query.getResultList();
    }
}
