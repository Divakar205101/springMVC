package com.java.springweb.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springweb.dto.LoginDto;
import com.java.springweb.dto.RegisterDto;
import com.java.springweb.entity.Register;
import com.java.springweb.repository.RegisterRepository;

@Service
public class RegisterService {

	@Autowired
	private RegisterRepository registerRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	public void processUserDetails(RegisterDto registerDto) {
	
		Register register=mapper.map(registerDto, Register.class);
		registerRepository.save(register);
	}
	 
	public boolean processuserlogin(LoginDto dto) {
		Register register=registerRepository.findByEmail(dto.getEmail());
		if(register!=null) {
			if(dto.getPassword().equalsIgnoreCase(register.getPassword()) && dto.getEmail().equalsIgnoreCase(register.getEmail())) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	public List<Register> getAllRegisterDetails(){
		return registerRepository.findAll();
	}
	

	public Register findById(Long id) {
		return registerRepository.findById(id);
	}

	
}
