package com.bit.day02.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

//	Logger log=Logger.getLogger(IndexCotroller.class);	
	Logger log=Logger.getLogger(this.getClass()); //객체를 찍어냈을떄 사용
	
	public IndexController() {
		System.out.println("index create....");
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		log.debug("index...");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index"); //접속할 주소 이름
		return mav;
	}

}
