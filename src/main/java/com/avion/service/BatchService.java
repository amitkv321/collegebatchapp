package com.avion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avion.dao.BatchDao;
import com.avion.model.BatchDetails;

@Service
public class BatchService {
	
	@Autowired
	BatchDao batchDao;
	
	public List<BatchDetails> getCompleteBatchDetails() {
		return batchDao.findAll();
	}

}
