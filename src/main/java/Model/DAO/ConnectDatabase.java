package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.jsp.tagext.TryCatchFinally;

public class ConnectDatabase {

	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException {
        String dbURL = "jdbc:sqlserver://ADMIN-PC\\SQLEXPRESS:1433;databaseName= manage_library;encrypt=false";
        String username = "sa";
        String password = "123";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        Connection conn = DriverManager.getConnection(dbURL, username, password);
        if (conn != null) {
            System.out.println("Kết nối thành công");
            return conn;
        }
        return null;
    }

	}

