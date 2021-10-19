package com.date;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateProvider {
	
	public static String returnDBDate() {
		//return new Date();
		
		Connection conn = null;
		//String currentDatefromDBinStr = null;
		Date currentDatefromDB = null;
		
        try {
 
        	//String connectionUrl = "jdbc:sqlserver://<server>:<port>;databaseName=AdventureWorks;user=<user>;password=<password>";
            String dbURL = "jdbc:sqlserver://localhost\\vm-lnx-alpspoc-:1433";
            //String dbURL = "jdbc:localhost://dbHost\\localhost;user=sa;password=secret";
            //String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=TestDB;integratedSecurity=true";
            String user = "sa";
            String pass = "alpsttpocdb12*";
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
    		String sqlStr = "SELECT GETDATE()";
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
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        if (currentDatefromDB!= null) {
        	return df.format(currentDatefromDB);
        }
        else {
        	return "DB connection error. Unable to get Date";
        }
        	
    }

	public static String returnGregorianCalendarTimestamp() {
		final Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		java.sql.Timestamp javagrsqlTsp = new java.sql.Timestamp(new GregorianCalendar(year, month-1, day).getTimeInMillis());
		return javagrsqlTsp.toString();
	}
	
}
