package com.sample.test.encapsulationQuiz;

public class UserBuilder implements Builder {

	private User user;

	public UserBuilder() {
		user = new User();
	}

	@Override
	public UserBuilder buildId(String id) {
		user.setId(id);
		return this;

	}

	@Override
	public UserBuilder buildName(String name) {
		user.setName(name);
		return this;

	}

	@Override
	public UserBuilder buildDept(String dept) {
		user.setDept(dept);
		return this;

	}

	@Override
	public UserBuilder buildSalary(int salary) {
		user.setSalary(salary);
		return this;

	}

	@Override
	public User createUser() {
		return user;
	}

}
