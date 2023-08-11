DROP DATABASE IF EXISTS sb_proj_2023_t;

CREATE DATABASE sb_proj_2023_t;

USE sb_proj_2023_t;

CREATE TABLE article(
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	updateDate DATETIME NOT NULL,
	title CHAR(100) NOT NULL,
	`body` TEXT NOT NULL);
	
INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목1',
`body`= '내용1';