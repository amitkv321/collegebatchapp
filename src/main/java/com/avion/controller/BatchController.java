package com.avion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RefreshScope
public class BatchController {
	
	@Autowired
	BatchService batchService;

	@Value("${college.name}")
	String collegeName;
	
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
	public ResponseEntity<BatchDetails> addBatches(@RequestBody BatchDetails batch) {
		BatchDetails response = batchService.addBatch(batch);
		return new ResponseEntity<BatchDetails>(response, HttpStatus.OK);
	}
	
	@GetMapping("testconfig")
	public String testConfig() {
		return collegeName;
	}
}
