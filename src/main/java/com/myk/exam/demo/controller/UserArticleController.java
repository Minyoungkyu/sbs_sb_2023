package com.myk.exam.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myk.exam.demo.service.ArticleService;
import com.myk.exam.demo.vo.Article;

@Controller
public class UserArticleController {
	
	
	private final ArticleService articleService;
	
	@Autowired
	public UserArticleController(ArticleService articleService) {
		this.articleService = articleService;
	}
	
	
	@RequestMapping("/user/article/doAdd")
	@ResponseBody
	public String doAdd(String title, String body) {
		return articleService.doAdd(title, body);
		
	}
	
	@RequestMapping("/user/article/getArticles")
	@ResponseBody
	public List<Article> getArticles() {
		return articleService.getArticles();
	}
	
	@RequestMapping("/user/article/doDelete")
	@ResponseBody
	public String doDelete(int id) {
		
		return articleService.doDelete(id);
	}

	
	@RequestMapping("/user/article/doModify")
	@ResponseBody
	public String doModify(int id, String title, String body) {
		
		return articleService.doModify(id, title, body);
		
	}
	
	@RequestMapping("/user/article/getArticle")
	@ResponseBody
	public Optional<Article> getArticleAction(int id) {
		
		return articleService.getArticle(id);
	}
			
}
