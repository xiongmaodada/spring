package com.xxx.spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xxx.spring.person.PersonService;

public class PerServiceTest {
	private ApplicationContext ac = null;
	
	@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}
	@Test
	public void testSfpring(){
		PersonService ps =  (PersonService) ac.getBean("personService");
		ps.info();
	}
}
