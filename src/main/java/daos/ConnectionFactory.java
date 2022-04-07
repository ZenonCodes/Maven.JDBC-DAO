package daos;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class ConnectionFactory {
        public static final String URL = "jdbc:mysql://localhost:3306/JDBC";
        public static final String USER = "vera";
        public static final String PASS = "test123";


        public static Connection getConnection() {
            try {
                DriverManager.registerDriver(new Driver());
                return DriverManager.getConnection(URL, USER, PASS);
            } catch (SQLException ex) {
                throw new RuntimeException("Error connecting tot he database", ex);
            }
        }





}
