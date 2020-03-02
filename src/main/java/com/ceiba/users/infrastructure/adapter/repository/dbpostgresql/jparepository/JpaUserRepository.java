package com.ceiba.users.infrastructure.adapter.repository.dbpostgresql.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceiba.users.infrastructure.adapter.repository.dbpostgresql.jpaentity.JpaUser;

@Repository
public interface JpaUserRepository extends JpaRepository<JpaUser, Long>{
	
}
