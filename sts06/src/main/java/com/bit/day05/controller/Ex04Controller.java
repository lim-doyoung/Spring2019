package com.bit.day05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class Ex04Controller {
	//class���� ������ �ְ� �Ⱥ����� �ִµ� Ŭ������ �������� ���� �����̽� ������ �Ѵ�. �ϳ��� ��Ʈ�ѷ��� �پ��� ������Ʈ�� ������ �ϱ� ����
	//xml�� ���� �������� ���ư��� ������ "/" �� �ٿ�����Ѵ�
	@RequestMapping(value="/ex04" , method= RequestMethod.GET )
	public String ex04() {
		return "ex04";
		
	}
	@RequestMapping(value="/ex05", method=RequestMethod.POST)
	public String ex05() {
		return "ex05";
	}
}
