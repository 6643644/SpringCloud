package com.example;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.entity.User;
import com.example.main.Main;

/******************************************************************************************
 * @author Miles
 * 
 *         撰寫測試是否可以撈DB和呼叫RESTController的測試程式 綁定@SpringBootTest 並且帶入參數1.classes=
 *         { Main.class } 為Spring Boot的入口class;2.webEnvironment =
 *         SpringBootTest.WebEnvironment.RANDOM_PORT 為表示使用隨機的PORT
 * 
 *******************************************************************************************/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Main.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MainTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void test1() {
		System.out.println("/Test1");
		String str = restTemplate.getForObject("/Test1", String.class);
		System.out.println("Test Service2 Controller URL:/Test1:" + str);
	}

	@Test
	public void testJPA() {
		System.out.println("/TestJPA");
		List<User> users = new ArrayList<>();
		users = (List<User>) restTemplate.getForObject("/TestJPA", List.class);
		System.out.println("Test Service2 Controller URL:/TestJPA:" + users);
	}
}
