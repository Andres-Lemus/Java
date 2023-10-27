module com.aeld.user.db {
	exports com.aeld.user.auth;
	opens com.aeld.user.reflection to com.aeld.user.app;
}