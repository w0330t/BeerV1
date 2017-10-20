<%--
  Created by IntelliJ IDEA.
  User: Blueness
  Date: 2017/10/20
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@
        page contentType="text/html;charset=UTF-8" language="java"
             import="java.util.List"
%>
<%@ page import="java.util.Iterator" %>
<html>
<head>
    <title>Beer Recommendations</title>
</head>
<body>
    <h1 align="center">Beer Recommendations JSP</h1>
    <%
        List styles = (List)request.getAttribute("styles");
        Iterator it = styles.iterator();
        while (it.hasNext()) {
            out.print("<br>Try: " + it.next());
        }
    %>
</body>
</html>
