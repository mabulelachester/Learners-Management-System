package com.mabulela.learners.management.system.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mabulela.learners.management.system.entity.Learners;
import com.mabulela.learners.management.system.exception.LearnerNotFoundException;
import com.mabulela.learners.management.system.repository.LearnerRepository;

@Service
public class LearnerServiceImpl implements LearnerService {

	final LearnerRepository learnerRepository;

	public LearnerServiceImpl(LearnerRepository learnerRepository) {

		this.learnerRepository = learnerRepository;
	}

	@Override
	public Learners addLearner(Learners learner) {

		return learnerRepository.save(learner);
	}

	@Override
	public List<Learners> findAllLearners() {

		return learnerRepository.findAll();
	}

	@Override
	public List<Learners> findByLearnerFirstName(String learnerFirstName) {
		List<Learners> existingLearner = learnerRepository.findByLearnerFirstName(learnerFirstName);
		if (existingLearner.isEmpty()) {
			throw new LearnerNotFoundException("learner with first name: " + learnerFirstName + "not found");
		}
		return existingLearner;
	}

	@Override
	public List<Learners> findByLearnerLastName(String learnerLastName) {
		List<Learners> existingLearner = learnerRepository.findByLearnerLastName(learnerLastName);
		if(existingLearner.isEmpty()) {
			throw new LearnerNotFoundException("learner with last name" + learnerLastName + "not found");
		}
		return existingLearner;
	}

	@Override
	public List<Learners> findBylearnerGender(String learnerGender) {
		List<Learners> existingLearner = learnerRepository.findBylearnerGender(learnerGender);
		if(existingLearner.isEmpty()) {
			throw new LearnerNotFoundException("learner with gender " + learnerGender + "not found");
		}
		return existingLearner;
	}

	@Override
	public Learners updateByLearnerId(Long learnerId, Learners learner) {
		Learners existingLearner = learnerRepository.findById(learnerId)
				.orElseThrow(()-> new LearnerNotFoundException("learner with id: " + learnerId + "not found"));
		
		existingLearner.setLearnerFirstName(learner.getLearnerFirstName());
		existingLearner.setLearnerGender(learner.getLearnerGender());
		existingLearner.setLearnerLastName(learner.getLearnerLastName());
		
		
		
		return learnerRepository.save(existingLearner);
	}

	@Override
	public String deleteById(Long learnerId) {
		learnerRepository.deleteById(learnerId);
		return "learner with id " + learnerId + "got deleted successfully";
	}

	@Override
	public Learners findBylearnerId(Long learnerId) {
		Learners existingLearner = learnerRepository.findById(learnerId)
				.orElseThrow(()-> new LearnerNotFoundException("learner with id: " + learnerId + "not found"));;
		return existingLearner;
	}

}
