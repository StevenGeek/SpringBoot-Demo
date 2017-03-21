package com.steven.orm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class ArthurJPADemo {

	@Id
	@GeneratedValue
	private Integer id;
	

	@Column(nullable=true)
	private String nameaa;
	
	@Column
	private Integer age;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return nameaa;
	}
	
	public void setName(String name) {
		this.nameaa = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "ArthurJPADemo [id=" + id + ", nameaa=" + nameaa + ", age=" + age + "]";
	}
}
