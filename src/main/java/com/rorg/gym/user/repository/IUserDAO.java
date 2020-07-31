package com.rorg.gym.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rorg.gym.commons.domain.user.User;

@RepositoryRestResource(path="user")
public interface IUserDAO extends JpaRepository<User, Long> {
	
	public User findByIdUser(Long idUser);
	public User findByUserName(String userName);

}
