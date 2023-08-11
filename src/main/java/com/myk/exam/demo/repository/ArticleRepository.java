package com.myk.exam.demo.repository;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.myk.exam.demo.vo.Article;

@Mapper
public interface ArticleRepository {
	
	@Insert("INSERT INTO article SET regDate = NOW(), updateDate = NOW(), title = #{title}, `body`= #{body}")
	void doAdd(@Param("title")String title, @Param("body")String body);
		
	@Select("SELECT * FROM article")
	List<Article> getArticles();
	
	@Delete("DELETE FROM article WHERE id = #{id}")
	void doDelete(@Param("id")int id);
	
	@Update("UPDATE article SET title = #{title}, `body` = #{body} WHERE id = #{id}")
	void doModify(@Param("id")int id, @Param("title")String title, @Param("body") String body);
	
	@Select("SELECT * FROM article WHERE id = #{id}")
	Optional<Article> getArticle(@Param("id")int id);



	
}
