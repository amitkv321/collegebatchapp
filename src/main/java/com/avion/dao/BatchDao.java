package com.avion.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.avion.model.BatchDetails;

@Repository
public interface BatchDao extends CrudRepository<BatchDetails, Integer>, BatchCustomDao {

	public int countByBatchIdGreaterThan(int i);
	
	public BatchDetails findByBatchId(int id);
}
