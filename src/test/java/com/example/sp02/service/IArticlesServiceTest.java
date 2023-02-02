package com.example.sp02.service;

import com.example.sp02.model.Articles;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IArticlesServiceTest {

	@Autowired
	private IArticlesService articlesService;

	@BeforeEach
	public void before(){

	}

	@Test
	void insert() {
	}

	@Test
	void edit() {
	}

	@Test
	void delete() {
	}

	@Test
	void load() {
		Articles a = articlesService.load(17);
		System.out.println(a);
	}
}