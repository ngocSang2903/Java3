
package JdbcUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JdbcUtil {
    private static Connection conn;
    
    public static Connection getConnection(){
        if(conn == null){
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            String dbUser = "sa", dbPass = "123456789",
                    dbUrl = "jdbc:sqlserver://localhost:1433;" + ";databaseName=Account;trustServerCertificate=true;";
            conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
        return conn;
    }
}
    