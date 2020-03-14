package com.avion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avion.service.BatchService;

@RestController
@RequestMapping("batch")
public class BatchController {
	
	@Autowired
	BatchService batchService;

	@GetMapping("all")
	public List<?> getAllBatchDetails() {
		System.out.println("Hi");
		return batchService.getCompleteBatchDetails();
	}
}
