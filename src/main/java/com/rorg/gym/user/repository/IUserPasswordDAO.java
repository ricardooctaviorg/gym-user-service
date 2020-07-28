package com.rorg.gym.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rorg.gym.commons.domain.user.UserPassword;

@RepositoryRestResource(path="userPassword")
public interface IUserPasswordDAO extends JpaRepository<UserPassword, Long> {
	
	public UserPassword findByIdUser(Long idUser);
}
