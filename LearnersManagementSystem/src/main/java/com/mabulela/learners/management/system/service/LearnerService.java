package com.mabulela.learners.management.system.service;

import java.util.List;

import com.mabulela.learners.management.system.entity.Learners;

public interface LearnerService {
	
	
	Learners addLearner(Learners learner);
	List<Learners> findAllLearners();
	List<Learners> findByLearnerFirstName(String learnerFirstName);
	List<Learners> findByLearnerLastName(String learnerLastName);
	List<Learners> findBylearnerGender(String learnerGender);
	Learners findBylearnerId(Long learnerId);
	Learners updateByLearnerId(Long learnerId, Learners learner);
	String deleteById(Long learnerId);
	
	
	
	
	

}
