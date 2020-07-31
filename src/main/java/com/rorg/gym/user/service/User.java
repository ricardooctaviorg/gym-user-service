package com.rorg.gym.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rorg.gym.user.repository.IUserDAO;

@Service
public class User implements IUser {
	
	@Autowired
	private IUserDAO iUserDAO;

	@Override
	public com.rorg.gym.commons.domain.user.User getUserById(Long idUser) {
		return iUserDAO.findByIdUser(idUser);
	}

}
