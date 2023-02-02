package com.example.sp02.service;

import com.example.sp02.model.Articles;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IArticlesService {
	int insert(Articles record);

	int edit(Articles record);

	int delete(Integer id);

	@Transactional(readOnly = true)
	Articles load(Integer id);

}
