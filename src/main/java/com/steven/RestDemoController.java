package com.steven;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steven.model.ArthurDemo2;
import com.steven.orm.mapper.CustomArthurDemo2Mapper;

@RestController
@RequestMapping("demo/")
public class RestDemoController {
	@Autowired
	private CustomArthurDemo2Mapper customArthurDemo2Mapper;
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
}
