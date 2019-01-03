package com.example.consumer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void test() {
		assertEquals(0,1);
	}

}

