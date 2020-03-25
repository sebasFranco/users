package com.ceiba.users.infrastructure.adapter.controller.springcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceiba.users.application.caseuse.FindUserByDni;
import com.ceiba.users.application.caseuse.UpdateAmountMoviesUser;
import com.ceiba.users.domain.model.User;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired
	private FindUserByDni findUserByDni;
	
	public UserRestController(FindUserByDni findUserByDni) {
		this.findUserByDni = findUserByDni;
	}
	
	@GetMapping("/{id}")
	public User findByDni(@PathVariable Long id) {
		return findUserByDni.findUserByDni(id);
	}
}
