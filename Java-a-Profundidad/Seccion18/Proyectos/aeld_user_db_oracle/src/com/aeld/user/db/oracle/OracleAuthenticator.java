package com.aeld.user.db.oracle;

import java.util.HashMap;
import java.util.Map;

import com.aeld.user.auth.UserDatabaseAuthentication;

public class OracleAuthenticator implements UserDatabaseAuthentication{
	
	private Map<String, String> users = new HashMap<>();
	
	public OracleAuthenticator() {
		users.put("algo", "Java !");
		users.put("placeholder", "password");
	}
	
	public boolean authenticate(String username, String password) {
		System.out.println("Authenticating with Oracle");
		String pass = users.get(username);
		return (pass != null  && pass.equals(password))?true:false;
	}
}
