package com.cccsoft;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigClientApplicationTests {

	@Value("${neo.hello}")
	private  String  hello;

	@Test
	public void contextLoads() {
		System.out.println("************************************************************");
		System.out.println("hello value : "+hello);
		System.out.println("************************************************************");
	}

}
