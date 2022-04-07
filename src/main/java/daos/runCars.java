package daos;

import java.sql.Connection;

import static daos.ConnectionFactory.getConnection;

public class runCars {
    public static void main(String[] args) {
        Connection connection = getConnection();
    }
}
