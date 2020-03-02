package com.ceiba.users.domain.ports;

import com.ceiba.users.domain.model.User;

public interface UserRepository {
	
	
	/**
	 *Metodo encargado de buscar un usuario por su dni
	 *@param dni
	 *@return  User con el  dni
	 */
	User findUserByDni(Long dni);
	
	/**
	 *Metodo encargado de actualizar las peliculas asociadas al usuario
	 *@param dni
	 */
	void updateAmountMoviesUser(Long dni);
	
}
