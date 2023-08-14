package com.myk.exam.demo.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.myk.exam.demo.vo.Member;

@Mapper
public interface MemberRepository {

	
	@Insert("""
			INSERT INTO `member`
			SET regDate = NOW(),
			updateDate = NOW(),
			loginId = #{loginId},
			loginPw = #{loginPw},
			`name` = #{name},
			nickname = #{nickName},
			cellphoneNumber = #{cellphoneNumber},
			email = #{email}
			""")
	public void doJoin(@Param("loginId") String loginId, @Param("loginPw") String loginPw, @Param("name") String name,
			@Param("nickName") String nickName, @Param("cellphoneNumber") String cellPhoneNumber, @Param("email") String email);
	
	@Select("SELECT LAST_INSERT_ID()")
	public int getLastInsertId();
	
	@Select("""
			SELECT *
			FROM `member` AS M
			WHERE M.id = #{id}
			""")
	public Member getMemberById(@Param("id") int id);
	
	@Select("""
			SELECT *
			FROM `member` AS M
			WHERE M.loginId = #{loginId}
			""")
	public Member getMemberByLoginId(@Param("loginId") String loginId);

}
