package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloServiceTest {
	
	@Autowired
	HelloService helloService;

	@Test
	void test() {
		assertEquals(31, helloService.calc(10, 20));
	}

}
