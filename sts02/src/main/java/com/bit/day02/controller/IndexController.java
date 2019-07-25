package com.bit.day02.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

//	Logger log=Logger.getLogger(IndexCotroller.class);	
	Logger log=Logger.getLogger(this.getClass()); //��ü�� �������� ���
	
	public IndexController() {
		System.out.println("index create....");
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		log.debug("index...");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index"); //������ �ּ� �̸�
		return mav;
	}

}
