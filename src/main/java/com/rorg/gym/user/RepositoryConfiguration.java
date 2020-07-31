package com.rorg.gym.user;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.rorg.gym.commons.domain.account.Account;
import com.rorg.gym.commons.domain.account.ImageAccount;
import com.rorg.gym.commons.domain.account.PasswordPolicy;
import com.rorg.gym.commons.domain.core.rolePolicy.Object;
import com.rorg.gym.commons.domain.core.rolePolicy.Policy;
import com.rorg.gym.commons.domain.core.rolePolicy.PolicySimple;
import com.rorg.gym.commons.domain.core.rolePolicy.Role;
import com.rorg.gym.commons.domain.user.User;
import com.rorg.gym.commons.domain.user.UserImage;
import com.rorg.gym.commons.domain.user.UserName;
import com.rorg.gym.commons.domain.user.UserPassword;


@Configuration
public class RepositoryConfiguration implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(UserName.class
							, UserImage.class
							, User.class
							, UserPassword.class
							, PasswordPolicy.class
							, ImageAccount.class
							, Account.class
							, Role.class
							, Object.class
							, Policy.class
							, PolicySimple.class);
	}

}
