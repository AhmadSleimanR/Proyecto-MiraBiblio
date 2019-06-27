package util;

import java.util.ResourceBundle;

/**
 *
 * @author Ahmad
 */
public class Util {
    public static final int JDBC=0;
    public static final int JPA=1;
    
    
    public static int opc;
    
    public static String msg01;
    
    static {
        ResourceBundle properties = ResourceBundle.getBundle("util.config");
        opc = Integer.parseInt(properties.getString("opc"));
        msg01 = properties.getString("mensaje01");
    }
}
