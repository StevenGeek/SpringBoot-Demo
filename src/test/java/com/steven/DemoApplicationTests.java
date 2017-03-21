package com.steven;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.steven.orm.client.ArthurJPADemoRepository;
import com.steven.orm.model.ArthurJPADemo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private RestDemoController restdemocontroller;
	@Autowired
	private ArthurJPADemoRepository ArthurJPADemoRepository;
	@Test
	public void contextLoads() {

		ArthurJPADemo arthurJPADemo = new ArthurJPADemo();
		arthurJPADemo.setName("a");
		arthurJPADemo.setAge(1);
		ArthurJPADemoRepository.save(arthurJPADemo);
		System.out.println(ArthurJPADemoRepository.findAll());
		System.out.println(restdemocontroller.selectById().toString());
	}

}
