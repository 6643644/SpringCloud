package com.sample.test.encapsulationQuiz;

public class EncapsulationQuiz {
	public static void main(String[] args) {
		// Lab:請封裝以下物件及流程，並防止直接存取 User的成員(屬性)
		// Tip: 利用建構子及宣告method

		//		User user1 = new User();
		//		user1.id = "0101";
		//		user1.name = "Tiffany";
		//		
		User user1 = new UserBuilder().buildId("0101").buildName("Tiffany").createUser();

		if ("01".equals(user1.getId().substring(0, 2))) {
			user1.setDept("Marketing");
		} else if ("02".equals(user1.getId().substring(0, 2))) {
			user1.setDept("IT");
		}
		//
		//		if ("01".equals(user1.id.substring(0, 2))) {
		//			user1.dept = "Marketing";
		//		} else if ("02".equals(user1.id.substring(0, 2))) {
		//			user1.dept = "IT";
		//		}
		//
		//		User user2 = new User();
		//		user2.id = "0201";
		//		user2.name = "Kevin";
		//
		//		if ("01".equals(user2.id.substring(0, 2))) {
		//			user2.dept = "Marketing";
		//		} else if ("02".equals(user2.id.substring(0, 2))) {
		//			user2.dept = "IT";
		//		}

		User user2 = new UserBuilder().buildId("0201").buildName("Kevin").createUser();

		if ("01".equals(user2.getId().substring(0, 2))) {
			user2.setDept("Marketing");
		} else if ("02".equals(user2.getId().substring(0, 2))) {
			user2.setDept("IT");
		}
	}

}