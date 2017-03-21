package com.steven.orm.client;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steven.orm.model.ArthurJPADemo;

public interface ArthurJPADemoRepository extends JpaRepository<ArthurJPADemo, Integer> {
	ArthurJPADemo findById(Integer id);
}
