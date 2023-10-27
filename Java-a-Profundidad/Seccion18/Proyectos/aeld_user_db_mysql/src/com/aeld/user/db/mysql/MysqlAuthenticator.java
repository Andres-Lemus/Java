package com.aeld.user.db.mysql;

import java.util.HashMap;
import java.util.Map;

import com.aeld.user.auth.UserDatabaseAuthentication;

public class MysqlAuthenticator implements UserDatabaseAuthentication{
	
	private Map<String, String> users = new HashMap<>();
	
	public MysqlAuthenticator() {
		users.put("algo", "Java !");
		users.put("placeholder", "password");
	}
	
	public boolean authenticate(String username, String password) {
		System.out.println("Authenticating with Mysql");
		String pass = users.get(username);
		return (pass != null  && pass.equals(password))?true:false;
	}
}
