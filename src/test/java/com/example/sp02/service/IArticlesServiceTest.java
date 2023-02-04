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

	private Articles articles;

	@BeforeEach
	public void before(){
		articles = new Articles();
	}

	@Test
	void insert() {
		articles.setTitle("新的一天开始了");
		articles.setBody("今天又是美好的一天");
		articlesService.insert(articles);
	}

	@Test
	void edit() {
		articles.setTitle("新的一天元气满满");
		articles.setBody("喜气洋洋");
		articles.setId(238);
		articlesService.edit(articles);
	}

	@Test
	void delete() {
		articles.setId(237);
		articlesService.delete(articles.getId());
	}

	@Test
	void load() {
		Articles a = articlesService.load(17);
		System.out.println(a);
	}
}