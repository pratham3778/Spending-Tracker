//Create java class

package db;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author prathamtanpure
 */
public class DbConnect {
    public static Connection c;
    public static Statement st;
    
    static {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb"+"?useSSL=false", "root", "pratham3778");
            st = c.createStatement();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
