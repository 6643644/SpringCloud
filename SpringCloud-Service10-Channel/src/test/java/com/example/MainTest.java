package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.main.Main;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Main.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MainTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void test0URL() {
		System.out.println("Test0");
		String str = restTemplate.getForObject("/test0", String.class);
		Assert.assertEquals("Test Url:/test0:", str);
	}
}
