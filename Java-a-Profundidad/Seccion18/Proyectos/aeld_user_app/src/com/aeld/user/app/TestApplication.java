package com.aeld.user.app;

import java.util.ServiceLoader;

import com.aeld.user.auth.UserDatabaseAuthentication;

public class TestApplication {
	public static void main(String[] args) {
		ServiceLoader<UserDatabaseAuthentication> service =  ServiceLoader.load(UserDatabaseAuthentication.class);
		 service.
		 forEach(s->s.authenticate("algo", "Java !"));
	}
}
