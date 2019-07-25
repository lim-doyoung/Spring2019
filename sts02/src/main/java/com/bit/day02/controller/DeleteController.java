package com.bit.day02.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.bit.day02.model.Day02Dao;
import com.bit.day02.model.entity.Day02Vo;

public class DeleteController implements Controller{
	Logger log=Logger.getLogger(this.getClass());
	private Day02Dao dao;
	public void setDao(Day02Dao dao) {
		this.dao = dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav=new ModelAndView();
		if(request.getMethod().equals("POST")) {
			int num=Integer.parseInt(request.getParameter("idx"));
			dao.deleteOne(num);
		}
		return mav;
	}

}
