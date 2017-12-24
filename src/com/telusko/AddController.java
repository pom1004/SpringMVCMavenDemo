package com.telusko;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
//		System.out.println("I am here. Lol");
		int i = Integer.parseInt(request.getParameter("t1"));
		int j = Integer.parseInt(request.getParameter("t2"));
		System.out.println("i: "+i+ " j:"+j);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("re", (i+j));
		
		return mv;
	}

}