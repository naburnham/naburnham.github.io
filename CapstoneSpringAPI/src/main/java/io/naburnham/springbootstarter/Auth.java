package io.naburnham.springbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


// FIXME: This is kind of working, prompts me for a password on the website

// Need to figure out to authenticate Enrollment Staff vs Student
// Need to figure out how to block many features from the Student
	// Watch JavaBrain SpringBoot Security tutorials

@Configuration
@EnableWebSecurity
public class Auth extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authorizeRequests().anyRequest().authenticated()
			.and()
			.httpBasic();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
			.withUser("admin")
			.password("{noop}password")
			.roles("STAFF");
	}
}
