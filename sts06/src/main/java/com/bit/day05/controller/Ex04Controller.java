package com.bit.day05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class Ex04Controller {
	//class에는 붙을수 있고 안붙을수 있는데 클래스에 붙을때는 네임 스페이스 역할을 한다. 하나의 컨트롤러에 다양한 리퀘스트를 가지가 하기 위함
	//xml과 같은 형식으로 돌아가기 때문에 "/" 를 붙여줘야한다
	@RequestMapping(value="/ex04" , method= RequestMethod.GET )
	public String ex04() {
		return "ex04";
		
	}
	@RequestMapping(value="/ex05", method=RequestMethod.POST)
	public String ex05() {
		return "ex05";
	}
}
