<%@ page import="com.date.DateProvider" %>

<html>
<body>
<h2>System Time from App Server: <%= new java.util.Date() %></h2>
<h2>System Time from DB Server: <%= DateProvider.returnDBDate()%></h2>
</body>
</html>
