package com.avion.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.avion.dao.BatchCustomDao;
import com.avion.model.BatchDetails;

@Repository
public class BatchDaoImpl implements BatchCustomDao {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<BatchDetails> findAll() {
		return entityManager.createNamedQuery("getAllBatchDetails", BatchDetails.class).getResultList();
	}

}
