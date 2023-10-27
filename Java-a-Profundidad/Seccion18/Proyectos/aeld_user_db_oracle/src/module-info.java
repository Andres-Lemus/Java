import com.aeld.user.auth.UserDatabaseAuthentication;
import com.aeld.user.db.oracle.OracleAuthenticator;

module com.aeld.db.oracle {
	requires com.aeld.user.db;
	provides UserDatabaseAuthentication with OracleAuthenticator;
}