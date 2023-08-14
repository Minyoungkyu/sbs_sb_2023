package com.myk.exam.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myk.exam.demo.repository.MemberRepository;
import com.myk.exam.demo.vo.Member;

@Service
public class MemberService {

	private final MemberRepository memberRepository;

	@Autowired
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	public int doJoin(String loginId, String loginPw, String name, String nickName, String cellphoneNumber,
			String email) {
		Member oldMember = getMemberByLoginId(loginId);

		if ( oldMember != null ) {
			return -1;
		}

		memberRepository.doJoin(loginId, loginPw, name, nickName, cellphoneNumber, email);
		return memberRepository.getLastInsertId();
	}
	
	private Member getMemberByLoginId(String loginId) {
		return memberRepository.getMemberByLoginId(loginId);
	}

	public Member getMemberById(int id) {
		return memberRepository.getMemberById(id);
	}

}
