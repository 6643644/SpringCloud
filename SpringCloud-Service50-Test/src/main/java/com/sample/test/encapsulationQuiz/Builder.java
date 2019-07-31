package com.sample.test.encapsulationQuiz;

public interface Builder {
	public UserBuilder buildId(String id);
	
	public UserBuilder buildName(String name);
	
	public UserBuilder buildDept(String dept);
	
	public UserBuilder buildSalary(int salary);
	
	public User createUser();
}
