package com.rorg.gym.user;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.rorg.gym.commons.domain.user.User;
import com.rorg.gym.commons.domain.user.UserImage;
import com.rorg.gym.commons.domain.user.UserName;
import com.rorg.gym.commons.domain.user.UserPassword;


@Configuration
public class RepositoryConfiguration implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(UserName.class
							, UserImage.class
							, User.class
							, UserPassword.class);
	}

}
