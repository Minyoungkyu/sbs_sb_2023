package com.myk.exam.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myk.exam.demo.repository.ArticleRepository;
import com.myk.exam.demo.vo.Article;

@Service
public class ArticleService {

	private final ArticleRepository articleRepository;

	@Autowired
	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;

	}

	public String doAdd(String title, String body) {
		articleRepository.doAdd(title, body);
		return "완료";

	}

	public List<Article> getArticles() {
		return articleRepository.getArticles();
	}

	public String doDelete(int id) {

		if (articleRepository.getArticle(id).isEmpty()) {
			return "해당 게시물이 존재하지 않습니다.";
		} else {
			articleRepository.getArticle(id).ifPresent(a -> articleRepository.doDelete(a.getId()));
			return id + "번 게시물 삭제완료";
		}
	}

	public String doModify(int id, String title, String body) {

		if (articleRepository.getArticle(id).isEmpty()) {
			return "해당 게시물이 존재하지 않습니다.";
		} else {
			articleRepository.getArticle(id).ifPresent(a -> articleRepository.doModify(a.getId(), title, body));
			return id + "번 게시물 수정완료";
		}

	}

	public Optional<Article> getArticle(int id) {

		return articleRepository.getArticle(id);
	}

}
