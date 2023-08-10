package com.myk.exam.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myk.exam.demo.vo.Article;

@Controller
public class UserArticleController {
	
	private List<Article> articles;
	private int lastArticleId;
	
	public UserArticleController() {
		articles = new ArrayList<>();
		lastArticleId = 0;
	}
	
	@RequestMapping("/user/article/doAdd")
	@ResponseBody
	public Article doAdd(String title, String body) {
		
		Article article = new Article(++lastArticleId, title, body);
		
		articles.add(article);
		
		return article;
		
	}
	
	@RequestMapping("/user/article/getArticles")
	@ResponseBody
	public List<Article> getArticles() {
		return articles;
	}

}
