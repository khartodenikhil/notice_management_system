/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package try1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nikhil
 */
class conntry {
    public static Connection connectdb()
            {
                Connection conn=null;
                try
                {
                   conn =DriverManager.getConnection("jdbc:derby://localhost:3306/try", "root", "mysql123");
                    return conn;
                }
                catch(SQLException e)
                {
                    System.out.println("Error Occured: "+ e);
                }
                return null;
            }
}
