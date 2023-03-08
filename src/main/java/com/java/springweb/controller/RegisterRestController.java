package com.java.springweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.springweb.dto.RegisterDto;
import com.java.springweb.entity.Register;
import com.java.springweb.service.RegisterService;



//@Controller
//@ResponseBody
@RestController
public class RegisterRestController {
   
	@Autowired
	private RegisterService registerService;
	
	@GetMapping(value = "/getAllRegisterDetails")
	public @ResponseBody List<Register> getAllRegisterDetails(){
		
		List<Register> registers =registerService.getAllRegisterDetails();
		
		return registers;
	}
	
	public void saveUser(@RequestBody RegisterDto dto) {
		registerService.processUserDetails(dto);
	}
	
	@GetMapping(value="/getById/{id}")
	public @ResponseBody Register getById(@PathVariable("id") Long id) {
		return registerService.findById(id);
	}
	
}
