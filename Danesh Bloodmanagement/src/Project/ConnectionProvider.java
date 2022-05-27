
package Project;
import java.sql.*;

/**
 *
 * @author Tania
 */
public class ConnectionProvider
{
    
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/donor","root","anny1234");
            System.out.println("db connection successful");
            return con;
            
        }
        catch(Exception e)
        {
            System.out.println("db connection fail");
            System.out.println(e);
            return null;
            
        }
    }
}
