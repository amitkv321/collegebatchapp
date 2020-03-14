package com.avion.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avion.dao.BatchCustomDao;
import com.avion.model.BatchDetails;

@Repository
public class BatchDaoImpl implements BatchCustomDao {

	@Autowired
	EntityManager entityManager;
	
	@Override
	public List<BatchDetails> findAll() {
		return entityManager.createNamedQuery("getAllBatchDetails", BatchDetails.class).getResultList();
	}

}
