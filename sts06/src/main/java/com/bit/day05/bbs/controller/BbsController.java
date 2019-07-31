package com.bit.day05.bbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.day05.model.Day02Dao;
import com.bit.day05.model.entity.Day02Vo;

@Controller
@RequestMapping(value="/bbs")
public class BbsController {
	//setter 대신 해줌
	@Autowired
	Day02Dao day02Dao;
	
	//어노테이션선언을 해야 불러오는데 선언을안해서 못불러옴 day02 setter 불러옴
	@Autowired
	public void setDay02Dao(Day02Dao day02Dao) {
		this.day02Dao = day02Dao;
	}

	@RequestMapping(value="/list")
	public void list(Model model) {
		model.addAttribute("alist",day02Dao.selectAll());
	}
	
	@RequestMapping(value="/add" , method=RequestMethod.GET)
	public void add() {
		
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@ModelAttribute Day02Vo bean) {
		day02Dao.insertOne(bean);
		return "redirect:list";
		
	}
	
	@RequestMapping("/detail")
	public void one(@RequestParam("idx") int num,Model model) {
		model.addAttribute("bean",day02Dao.selectOne(num));
	}
}
