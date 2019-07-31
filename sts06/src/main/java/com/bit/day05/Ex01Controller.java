package com.bit.day05;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.lang.jstl.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller
public class Ex01Controller implements Controller{

	org.slf4j.Logger log=LoggerFactory.getLogger(getClass());
	
	@Override
	@RequestMapping("/ex01")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView("ex01");
		mav.addObject("msg","hello");
		return mav;
	}
	
	//주소명으로 찾아가서 실행시킴
	@RequestMapping(value="/ex06.bit")
	public void ex06page(HttpServletRequest req) {
		req.setAttribute("msg", "send message");
		log.debug("ex06 controller");
	}
	
	@RequestMapping("/ex08")
	public String ex08(Model model) {
		model.addAttribute("msg", "allo");
		return "ex01";
	}
	
	@RequestMapping("/ex07")
	public View ex07() {
		return new View() {
			
			@Override
			public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
					throws Exception {
				log.debug("ex07 render");
				PrintWriter out=response.getWriter();
				out.print("test page");
			}
			
			@Override
			public String getContentType() {
				log.debug("ex07 contextType");
				return null;
			}
		};
	}
	

}
