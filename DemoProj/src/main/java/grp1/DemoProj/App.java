package grp1.DemoProj;

import java.sql.*;
public class App 
{
    public static void main( String[] args )
    {
        Connection conn=null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","name","pass");
//            if(conn!=null) {
                System.out.println("Connection with database established");
//            }
        }
        catch(SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
