import java.sql.*;
import javax.swing.JOptionPane;

public class conDB {
    public static Connection con(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/tiketinaja","root","");
        }
        catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println("Connection Failed!\n"+e.getMessage());
        }
        return con;
    }   
}
