package com.example.sp02.service.impl;

import com.example.sp02.mapper.ArticlesMapper;
import com.example.sp02.model.Articles;
import com.example.sp02.service.IArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticlesServiceImpl implements IArticlesService {

	@Autowired
	private ArticlesMapper articlesMapper;

	@Override
	public int insert(Articles record) {
		return articlesMapper.insert(record);
	}

	@Override
	public int edit(Articles record) {
		return articlesMapper.updateByPrimaryKey(record);
	}

	@Override
	public int delete(Integer id) {
		return articlesMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Articles load(Integer id) {
		return articlesMapper.selectByPrimaryKey(id);
	}
}
