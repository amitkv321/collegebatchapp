package com.avion.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.avion.model.BatchDetails;

@Repository
public interface BatchDao {

	public List<BatchDetails> findAll();
}
