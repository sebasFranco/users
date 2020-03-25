package com.ceiba.users.infrastructure.adapter.repository.dbpostgresql.db;

import org.springframework.stereotype.Component;

import com.ceiba.users.domain.model.User;
import com.ceiba.users.domain.ports.UserRepository;
import com.ceiba.users.infrastructure.adapter.repository.dbpostgresql.jpaentity.JpaUser;
import com.ceiba.users.infrastructure.adapter.repository.dbpostgresql.jparepository.JpaUserRepository;
import com.ceiba.users.infrastructure.adapter.repository.dbpostgresql.mapper.JpaUserMapper;

@Component
public class PostgresqlUserRepository implements UserRepository{
	
	
	JpaUserRepository jpaUserRepository;
	
	public PostgresqlUserRepository(JpaUserRepository jpaUserRepository) {
		this.jpaUserRepository = jpaUserRepository;
	}

	@Override
	public User findUserByDni(Long dni) {
		return JpaUserMapper.toUser(jpaUserRepository.getOne(dni));
	}

	@Override
	public void updateAmountMoviesUser(Long dni) {
		JpaUser user = jpaUserRepository.getOne(dni);
		user.setAmountMovies(user.getAmountMovies() + 1);
		jpaUserRepository.save(user);
	}
	
	
	
}
