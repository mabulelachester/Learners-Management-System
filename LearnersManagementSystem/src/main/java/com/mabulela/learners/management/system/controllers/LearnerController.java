package com.mabulela.learners.management.system.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;	
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mabulela.learners.management.system.entity.Learners;
import com.mabulela.learners.management.system.service.LearnerService;

@RestController
@RequestMapping("/api")
public class LearnerController {
	
	final LearnerService learnerService;

	public LearnerController(LearnerService learnerService) {
		
		this.learnerService = learnerService;
	}
	
	@PostMapping("/addLearner")
	
	public ResponseEntity<Learners> addLearner(@RequestBody Learners learner){
		
		Learners savedLearner = learnerService.addLearner(learner);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(savedLearner);
	}
	
	@GetMapping("/getAllLearners")
	public ResponseEntity<List<Learners>> findAllLearners(){
		return ResponseEntity.ok(learnerService.findAllLearners());
	}
	
	@GetMapping("/getLearnerByID/{learnerId}")
	public ResponseEntity<Learners> findByLearnerId(@PathVariable Long learnerId)
	{
		return ResponseEntity.ok(learnerService.findBylearnerId(learnerId));
	}
	
	@GetMapping("/getLearnerByFirstName/{learnerFirstName}")
	public ResponseEntity<List<Learners>> findByLearnerFirstName(@PathVariable String learnerFirstName)
	{
		return ResponseEntity.ok(learnerService.findByLearnerFirstName(learnerFirstName));
	}
	@GetMapping("/getLearnerByLastName/{learnerLastName}")
	public ResponseEntity<List<Learners>> findByLearnerLastName(@PathVariable String learnerLastName)
	
	{
	 return ResponseEntity.ok(learnerService.findByLearnerLastName(learnerLastName));}
	
	@GetMapping("/getLearnerByGender/{learnerGender}")
	public ResponseEntity<List<Learners>> findByLearnerGender(@PathVariable String learnerGender)
	{
		return ResponseEntity.ok(learnerService.findBylearnerGender(learnerGender));
	}
	
	@PutMapping("/updateByLearnerId/{learnerId}")
	public ResponseEntity<Learners> updateBylearnerId(@PathVariable Long learnerId, @RequestBody Learners learner)
	{
		return ResponseEntity.ok(learnerService.updateByLearnerId(learnerId, learner));
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<?> deleteByLearnerId(@PathVariable Long learnerId)
	{
		return ResponseEntity.ok(learnerService.deleteById(learnerId));
	}
	
}
