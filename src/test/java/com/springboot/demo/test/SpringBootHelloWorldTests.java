package com.springboot.demo.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.demo.controllers.TestController;

@SpringBootTest
public class SpringBootHelloWorldTests {
	@Autowired
	private TestController testController;

	@Test
	public void contextLoads() {
		assertThat(testController).isNotNull();
	}

}
