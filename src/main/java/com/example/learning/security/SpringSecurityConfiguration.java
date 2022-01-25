//package com.example.learning.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import com.example.learning.service.impl.UserServiceImpl;
//
//@Configuration
//@EnableWebSecurity
//public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {
//	
//	@Autowired
//	UserServiceImpl userImpl;
//	@Override
//	protected void configure(AuthenticationManagerBuilder authentication) throws Exception{
//		authentication.userDetailsService(userImpl).passwordEncoder(passwordEncoder());
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception{
//		http.authorizeRequests().antMatchers("/","/login").permitAll()
//		.antMatchers("/homepage").authenticated()
//		.and().csrf().disable()
//		.formLogin().loginPage("/login")
//		.defaultSuccessUrl("/homepage")
//		.usernameParameter("username")
//		.passwordParameter("password")
//		.and().exceptionHandling().accessDeniedPage("/accessDenied")
//		.and()
//		.logout().logoutUrl("/logout").logoutSuccessUrl("/login");
//	}
//	
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
//}
