package com.bit.day02.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.day02.model.Day02Dao;
import com.bit.day02.model.entity.Day02Vo;

public class InsertController implements Controller {
	//생성하지않고 필드에 불러
	private Day02Dao dao;
	//세터로 생성
	public void setDao(Day02Dao dao) {
		this.dao = dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		ModelAndView mav=new ModelAndView();
		if(request.getMethod().equals("POST")) {
			Day02Vo bean=new Day02Vo();
			bean.setName(request.getParameter("name"));
			bean.setSub(request.getParameter("sub"));
			bean.setContent(request.getParameter("content"));
			dao.insertOne(bean);
//			mav.addObject(attributeValue)
			mav.setViewName("redirect:list.bit");
		}else {
			mav.setViewName("add");
		}
		return mav;
	}

}
