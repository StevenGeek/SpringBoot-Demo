package com.steven;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steven.orm.client.ArthurDemo2Mapper;
import com.steven.orm.client.CustomArthurDemo2Mapper;
import com.steven.orm.model.ArthurDemo2;

@RestController
@RequestMapping("demo/")
public class RestDemoController {
	@Autowired
	private CustomArthurDemo2Mapper customArthurDemo2Mapper;
	@Autowired
	private ArthurDemo2Mapper arthurDemo2Mapper;
	@RequestMapping("/")
	public String helloSpringBoot(){
		return "hello spring boot";
	}
	@RequestMapping("json")
	public Map<String, String> getJsonString(){
		Map<String, String> result = new HashMap<>();
		result.put("a", "a");
		result.put("b", "b");
		return result;
	}
	@RequestMapping("arthurDemo2")
	public List<ArthurDemo2> selectArthurDemo2(){
		return customArthurDemo2Mapper.selectAll();
	}
	@RequestMapping("arthurDemoTest")
	public ArthurDemo2 selectById(){
		return arthurDemo2Mapper.selectByPrimaryKey(1);
	}
}
