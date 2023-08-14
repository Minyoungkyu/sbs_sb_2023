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

CREATE TABLE `member` (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	updateDate DATETIME NOT NULL,
	loginId CHAR(20) NOT NULL,
	loginPw CHAR(60) NOT NULL,
	`authLevel`SMALLINT(2) UNSIGNED DEFAULT 3 COMMENT '(3=일반, 7=관리자)',
	`name` CHAR(20) NOT NULL,
	nickName CHAR(20) NOT NULL,
	cellphoneNumber CHAR(20) NOT NULL,
	email CHAR(50) NOT NULL,
	delStatus TINYINT(1) UNSIGNED NOT NULL DEFAULT 0 COMMENT '탈퇴여부',
	delDate DATETIME COMMENT '탈퇴날짜');  
		
INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'admin',
loginPw = 'admin',
authLevel = 7,
`name` = '관리자',
nickName = '관리자',
cellphoneNumber = '01011111111',
email = 'admin@gmail.com';
	
INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'user1',
loginPw = 'user1',
authLevel = 3,
`name` = '사용자1',
nickName = '사용자1',
cellphoneNumber = '01011111111',
email = 'user1@gmail.com';

INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'user2',
loginPw = 'user2',
authLevel = 3,
`name` = '사용자2',
nickName = '사용자2',
cellphoneNumber = '01011111111',
email = 'user2@gmail.com';