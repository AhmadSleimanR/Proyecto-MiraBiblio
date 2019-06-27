/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ahmad
 */
public class Conexion {
    private static Conexion instancia=null;
    private static Connection con=null;
    private static final String url="jdbc:sqlserver://localhost\\MSQLADMIN:1433;databaseName=MANTENIMIENTO";
    private static final String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String usuario="sa";
    private static final String clave="12345";

    private Conexion() {
        
        try {
            Class.forName(driver);
            con=DriverManager.getConnection(url, usuario,clave);
        } catch (Exception e) {
        }    
    }
    
    public synchronized static Conexion conectar(){
    if(instancia==null){
      instancia = new Conexion();        
    }
    return instancia;
    }

    public Connection getCon() {
        return con;
    }
    
    public void cerraConexion(){    
        instancia=null;
    }
    
    
    
}
