import com.aeld.user.auth.UserDatabaseAuthentication;

module com.aeld.user.app {
	requires java.base;
	requires com.aeld.user.db;
	uses UserDatabaseAuthentication;
}