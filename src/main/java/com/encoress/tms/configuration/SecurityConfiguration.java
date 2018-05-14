package com.encoress.tms.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.encoress.tms.domain.entity.User;
import com.encoress.tms.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserService userService;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

		for (User user : userService.getAllUsers()) {
			System.out.println(user.getName());
			System.out.println(user.getPassword());
			System.out.println(user.getRole().getName());
			auth.inMemoryAuthentication()
					.withUser(user.getName())
					.password(user.getPassword())
					.roles(user.getRole().getName());
		}

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		/*http.authorizeRequests()
			.antMatchers("/persons/**")
			.access("hasRole('ROLE_ADMIN')")
			.and().formLogin();
*/
	}

}