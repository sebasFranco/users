package com.ceiba.users.application.caseuse;

import org.springframework.stereotype.Service;

import com.ceiba.users.domain.ports.UserRepository;

@Service
public class UpdateAmountMoviesUser {
	
	private UserRepository userRepository;
	
	public UpdateAmountMoviesUser(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void updateAmountMoviesUser(Long dni) {
		userRepository.updateAmountMoviesUser(dni);
	}
}
