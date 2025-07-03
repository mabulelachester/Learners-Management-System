package com.mabulela.learners.management.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mabulela.learners.management.system.entity.Learners;

public interface LearnerRepository extends JpaRepository<Learners, Long> {
	
	List<Learners> findByLearnerFirstName(String learnerFirstName);
	List<Learners> findByLearnerLastName(String learnerLastName);
	List<Learners> findBylearnerGender(String learnerGender);

}
