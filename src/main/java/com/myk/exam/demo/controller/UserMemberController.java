package com.myk.exam.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myk.exam.demo.service.MemberService;

@Controller
public class UserMemberController {

	private final MemberService memberService;
	
	@Autowired
	public UserMemberController(MemberService memberService) {
		this.memberService=memberService;
	}
	
	
	
	@RequestMapping("/user/member/doJoin")
	@ResponseBody
	public String doJoin(String loginId, String loginPw, String name, String nickName, String cellphoneNumber,
			String email) {
		
		memberService.doJoin(loginId, loginPw, name, nickName, cellphoneNumber, email);
		
		return "안녕하세요";
	}

}