<%@ page import="com.date.DateProvider" %>

System Time from App Server: <%= new java.util.Date() %>
System Time from DB Server: <%= DateProvider.returnDBDate()%>
