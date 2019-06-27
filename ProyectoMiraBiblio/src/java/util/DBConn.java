package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
 
public class DBConn{

    private static String driver = null;
    private static String usuario = null;
    private static String password = null;
    private static String url = null;

    static {
        ResourceBundle properties = ResourceBundle.getBundle("util.config");
        url = properties.getString("URL");
        driver = properties.getString("DRIVER");
        usuario = properties.getString("USER");
        password = properties.getString("PASSWORD");
    }

/**
 * Obtiene una conexion a la Base de Datos.
     * @return 
 */
public static Connection getConnection() {
    Connection connection = null;
    try {
        Class.forName(driver);
        connection = DriverManager.getConnection(url, usuario, password);
    } catch (SQLException | ClassNotFoundException e) {
        System.out.println(Util.msg01+ e);
    }
    return connection;
}

}