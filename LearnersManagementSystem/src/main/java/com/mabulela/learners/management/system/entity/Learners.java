package com.mabulela.learners.management.system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "learnertbl",schema = "learnerdb")
public class Learners {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long learnerId;
	@NotBlank(message = "learner first name required")
	private String learnerFirstName;
	@NotBlank(message = "learner last name required")
	private String learnerLastName;
	private String learnerGender;
	public String getLearnerFirstName() {
		return learnerFirstName;
	}
	public void setLearnerFirstName(String learnerFirstName) {
		this.learnerFirstName = learnerFirstName;
	}
	public String getLearnerLastName() {
		return learnerLastName;
	}
	public void setLearnerLastName(String learnerLastName) {
		this.learnerLastName = learnerLastName;
	}
	public String getLearnerGender() {
		return learnerGender;
	}
	public void setLearnerGender(String learnerGender) {
		this.learnerGender = learnerGender;
	}
	public Learners(Long learnerId, String learnerFirstName, String learnerLastName, String learnerGender) {
		super();
		this.learnerId = learnerId;
		this.learnerFirstName = learnerFirstName;
		this.learnerLastName = learnerLastName;
		this.learnerGender = learnerGender;
	}
	public Learners() {
		
	}
	
	

}
