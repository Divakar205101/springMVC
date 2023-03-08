package com.java.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.springweb.dto.LoginDto;
import com.java.springweb.dto.RegisterDto;
import com.java.springweb.service.RegisterService;


@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	 @RequestMapping(value="/saveUserDetails")
	  public ModelAndView saveUserDetails(RegisterDto registerDto) {
			 System.out.println(registerDto);
		     registerService.processUserDetails(registerDto);
			 return new ModelAndView("index.jsp");
		}
	 
	 @RequestMapping(value = "/login")
	 public ModelAndView login(LoginDto dto) {
		 System.out.println(dto);
		 boolean isvaliduser=registerService.processuserlogin(dto);
		 if(isvaliduser) {
			 return new ModelAndView("home.jsp");
		 }
		 return new ModelAndView("login.jsp");
	 }
}
