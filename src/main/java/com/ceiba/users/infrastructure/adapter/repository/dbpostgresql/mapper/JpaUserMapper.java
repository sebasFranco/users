package com.ceiba.users.infrastructure.adapter.repository.dbpostgresql.mapper;

import com.ceiba.users.domain.model.User;
import com.ceiba.users.infrastructure.adapter.repository.dbpostgresql.jpaentity.JpaUser;

public class JpaUserMapper {

	public static User toUser(JpaUser jpaUser) {
		
		User userMapper = new User();
		
		userMapper.setDni(jpaUser.getDni());
		userMapper.setName(jpaUser.getName());
		userMapper.setLastName(jpaUser.getLastName());
		userMapper.setAmountMovies(jpaUser.getAmountMovies());
		
		return userMapper;
	}
}
