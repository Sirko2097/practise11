package source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DataSource {
    public static Connection getConnection() throws SQLException {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("mydb");
        Connection connection = DriverManager.getConnection(resourceBundle.getString("url"),
                resourceBundle.getString("login"), resourceBundle.getString("password"));
        return connection;
    }
}
