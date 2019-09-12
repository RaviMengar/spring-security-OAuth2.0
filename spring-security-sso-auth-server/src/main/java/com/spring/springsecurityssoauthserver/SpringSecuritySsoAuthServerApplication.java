package com.spring.springsecurityssoauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class SpringSecuritySsoAuthServerApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringSecuritySsoAuthServerApplication.class, args);
	}

}
