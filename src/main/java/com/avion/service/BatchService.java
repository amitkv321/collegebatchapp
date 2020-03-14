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

	public BatchDetails getBatchDetailsById(int id) {
		return batchDao.findByBatchId(id);
	}

	public int getCountForVal(int val) {
		return batchDao.countByBatchIdGreaterThan(val);
	}
	
	public long getAllCount() {
		return batchDao.count();
	}
	
	public BatchDetails addBatch(BatchDetails batch) {
		return batchDao.save(batch);
	}

}
