<%@ page import="com.date.DateProvider" %>
Welcome to Time Travel Application <p>
System Time fetched from App Server using java function java.util.Date(): <%= new java.util.Date() %> <p>
System Time fetched from App Server using java function java.sql.Timestamp(System.currentTimeMillis()): <%= new java.sql.Timestamp(System.currentTimeMillis()) %> <p>
System Time fetched from App Server using java Gregorian Calendar: <%= DateProvider.returnGregorianCalendarTimestamp() %> <p>
System Time from DB Server: <%= DateProvider.returnDBDate()%>
