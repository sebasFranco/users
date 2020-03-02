package com.ceiba.users.domain.model;

public class User {
	
	private Long dni;
	private String name;
	private String lastName;
	private int amountMovies;
	
	public User(Long dni, String name, String lastName, int amountMovies) {
		this.dni = dni;
		this.name = name;
		this.lastName = lastName;
		this.amountMovies = amountMovies;
	}

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

	public User() {
	}
	
}
