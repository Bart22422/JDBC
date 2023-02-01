
package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    // реализуйте настройку соеденения с БД
    public Util() throws SQLException,ClassNotFoundException{
    }
    private static final String url = "jdbc:mysql://localhost:3306/instructor";
    private static final String user = "root";
    private static final String pass = "testtest";

    private static Connection connection= null;

    public static Connection getConnection() throws SQLException {
        if(connection == null){
            connection = DriverManager.getConnection(url, user, pass);
        }
        return connection;
    }
    public static void closeConnection() throws SQLException {
        getConnection().close();
    }

}