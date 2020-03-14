package com.avion.dao;

import java.util.List;

import com.avion.model.BatchDetails;

public interface BatchCustomDao {
	
	public List<BatchDetails> findAll();

}
