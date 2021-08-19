package infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private ConnectionFactory(){}

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/DespesasDB", "root", "5239146795");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
