package com.myk.exam.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserHomeController {
	
	private static int Count;
	
	public UserHomeController() {
		Count = 0;
	}
	
	@RequestMapping("/user/home/getCount")
	@ResponseBody
	public int getCount() {
		return Count++; 
	}
	
	@RequestMapping("/user/home/doSetCount")
	@ResponseBody
	public String setCount(int count) {
		this.Count = count;
		return "카운트 값이 " + this.Count + " 로 초기화";
	}
	
	
}
