package com.rorg.gym.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rorg.gym.commons.domain.user.UserName;

@RepositoryRestResource(path="userName")
public interface IUserNameDAO extends JpaRepository<UserName, Long> {

}
