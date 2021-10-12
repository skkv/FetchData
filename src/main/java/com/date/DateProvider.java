package com.date;

import java.util.Date;
import java.sql.*;

public class DateProvider {
	
	public static Date returnDBDate() {
		return new Date();
		
/*		Connection conn = null;
		Date currentDatefromDB = null; 
		
        try {
 
        	//String connectionUrl = "jdbc:sqlserver://<server>:<port>;databaseName=AdventureWorks;user=<user>;password=<password>";
            String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
            String user = "sa";
            String pass = "secret";
            conn = DriverManager.getConnection(dbURL, user, pass);
            if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
            
            //Executing SQL query and fetching the result
    		Statement st = conn.createStatement();
    		String sqlStr = "SELECT SYSDATETIME()";
    		ResultSet rs = st.executeQuery(sqlStr);
    		while (rs.next()) {
    			System.out.println(rs.getDate(1));
    			currentDatefromDB = rs.getDate(1);
    			
    		}		
            
            
            
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        return currentDatefromDB;*/
        
    }


		
		
	

}
