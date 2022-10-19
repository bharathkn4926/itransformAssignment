package com.gontuseries.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		ModelAndView modelandview=new ModelAndView("HelloPage");
		ModelAndView modelandview2=new ModelAndView("Helloworld");
		modelandview.addObject("welcomeMessage","Hi user welcome to first mvc project");
		modelandview2.addObject("welcomeMessage2","Hello world");
		return modelandview2;
		
	}
	

}
