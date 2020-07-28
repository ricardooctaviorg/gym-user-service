package com.rorg.gym.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rorg.gym.commons.domain.user.UserImage;

@RepositoryRestResource(path="userImage")
public interface IUserImageDAO extends JpaRepository<UserImage, Long> {

}
