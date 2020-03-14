package com.avion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avion.model.BatchDetails;
import com.avion.service.BatchService;

@RestController
@RequestMapping("data")
public class BatchController {
	
	@Autowired
	BatchService batchService;

	@GetMapping("batches")
	public List<?> getAllBatchDetails() {
		return batchService.getCompleteBatchDetails();
	}
	
	@GetMapping("batch/{id}")
	public BatchDetails getBatchDetailsById(@PathVariable int id) {
		return batchService.getBatchDetailsById(id);
	}
	
	@GetMapping("count/{val}")
	public ResponseEntity<Integer> getCount(@PathVariable int val) {
		int num = batchService.getCountForVal(val);
		return new ResponseEntity<Integer>(num, HttpStatus.OK);
	}
	
	@PostMapping("batches")
	public ResponseEntity<BatchDetails> getCount(@RequestBody BatchDetails batch) {
		BatchDetails response = batchService.addBatch(batch);
		return new ResponseEntity<BatchDetails>(response, HttpStatus.OK);
	}
}
