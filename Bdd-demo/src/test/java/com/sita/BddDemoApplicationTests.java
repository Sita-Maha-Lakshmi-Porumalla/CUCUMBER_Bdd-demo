package com.sita;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = {Product.class})
class BddDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
