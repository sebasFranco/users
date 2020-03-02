package com.ceiba.users.application.caseuse;

import org.springframework.stereotype.Service;

import com.ceiba.users.domain.model.User;
import com.ceiba.users.domain.ports.UserRepository;

@Service
public class FindUserByDni {
	
	private UserRepository userRepository;
	
	public FindUserByDni(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User findUserByDni(Long dni) {
		return userRepository.findUserByDni(dni);
	}
	
}
