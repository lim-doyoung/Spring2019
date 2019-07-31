package com.bit.day05;

import org.apache.taglibs.standard.lang.jstl.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex11Controller {

	org.slf4j.Logger log=LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/ex11/{msg}/{su}")
	public String ex11(@PathVariable("msg") String msg,@PathVariable("su") int num) {
		log.debug(msg);
		log.debug(num+""); //스트링만들어오게 되잇음+""
		return "ex11";
	}
}
