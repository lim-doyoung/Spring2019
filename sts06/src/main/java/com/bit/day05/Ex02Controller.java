package com.bit.day05;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Ex02Controller {
	
	@RequestMapping("/ex02")
	public String mapping() {
		return "ex02";
	}
}
