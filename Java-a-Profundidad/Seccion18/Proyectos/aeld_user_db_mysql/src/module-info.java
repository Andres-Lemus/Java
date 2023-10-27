import com.aeld.user.auth.UserDatabaseAuthentication;
import com.aeld.user.db.mysql.MysqlAuthenticator;

module com.aeld.user.db.mysql {
	requires com.aeld.user.db;
	provides UserDatabaseAuthentication with MysqlAuthenticator;
}