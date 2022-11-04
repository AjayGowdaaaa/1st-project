package com.employeedatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeedatabase.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Employee findById( long empId);
	Employee deleteById( long empId);
	
	
	
	
	
//	Employee findById(int id);
//	Employee findByName( String name);
	
	
//	Candidate findByName( String name); 
//	 List<Candidate> findAllByGender( char gender);
//	 Candidate findByMobile( long mobile);
//	 List<Candidate> findByExperience(double experience);
//	 List<Candidate> findByQualification( String qualification);
//	 List<Candidate> findByBranch(String branch);
//	 List<Candidate> findByPercentage(double percentage);
//	 List<Candidate> findByPrimarySkill(String primarySkill);
//	 
//	 List<Candidate> findByExperienceGreaterThan(double experience);
//	 List<Candidate> findByPercentageGreaterThan(double percentage);

}
