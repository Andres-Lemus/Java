package com.aeld.user.auth;

public interface UserDatabaseAuthentication {
	
	public boolean authenticate(String username, String password);
	
}
