package com.ceiba.users.infrastructure.adapter.repository.dbpostgresql.jpaentity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity (name = "users")
public class JpaUser {
	
	@Id
	private Long dni;
	
	@NotNull
	private String name;
	
	@NotNull
	private String lastName;
	
	@NotNull
	private int amountMovies;
	
	
	public Long getDni() {
		return dni;
	}
	public void setDni(Long dni) {
		this.dni = dni;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAmountMovies() {
		return amountMovies;
	}
	public void setAmountMovies(int amountMovies) {
		this.amountMovies = amountMovies;
	}
	public JpaUser() {
	}
		
}
