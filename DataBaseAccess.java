package DataBaseAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

		// import java.sql.*;
		// we are using JDBC mySQL as database software

public class DataBaseAccess
{
    public static void main (String[] args)
    {
        Connection conn = null;
        
         // First we try to connect to Vitagene main database using username & password
        // here we use try catch method to retrieve data from database
        
        try
        {
            String userName = "root";
            String password = "testing";
            String url = "jdbc:mysql://localhost/test";// Here test = Name of Database e.g Vitagene
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            conn = DriverManager.getConnection (url, userName, password);
         
            System.out.println ("Database connection established");

            Statement s = conn.createStatement ();// Here we check some functionality in database
            int count;
            int rc=s.executeUpdate ("Update Gene Name ='MDM2' where MDM2=Retinoblastoma");
            // Here MDM2 represents a Gene present on chromosome no 13 responsiple for disease Retinoblastoma
            // MDM2 gene codes for the Mdm2 protein an important negative regulator of the p53 tumor suppressor.
            
            System.out.println(rc+" records are updated."); 
            s.executeQuery ("SELECT * From patient id");
            ResultSet rs = s.getResultSet ();
            while (rs.next ())
            {
                int idVal = rs.getInt ("Patient id"); // Patient object will be incremented hence constructors are used
                String nameVal = rs.getString (2);
                String catVal = rs.getString ("Threshold is < or = 0.7");
                System.out.println (
                        "id = " + idVal
                        + ", Gene name = " + nameVal
                        + ", Patient id = " + catVal);
           //     ++count;
            }
            rs.close ();
            s.close ();

            
            s.close ();
           // System.out.println (count + " rows were inserted");

        }
        catch (Exception e)// we use try-catch for exception handling
        {
            System.err.println ("Cannot connect to database server");
            System.out.println(e);
        }
        finally
        {
            if (conn != null)
            {
                try
                {
                    conn.close ();
                    System.out.println ("Database connection terminated"); //Logout of server
                }
                catch (Exception e) { /* ignore close errors */ }
            }
        }
    } 
}


