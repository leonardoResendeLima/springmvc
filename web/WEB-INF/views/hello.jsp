<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello Controller</title>
</head>
<body>
<h1>Hello from Controller </h1>

<%
    Integer id = (Integer) request.getAttribute("id");
    String name = (String) request.getAttribute("name");
    Integer salary = (Integer) request.getAttribute("salary");

    out.println("ID " + id);
    out.println("Name " + name);
    out.println("Salary " + salary);
%>

<br>Id : <b>${id}</b>
<br>Name : <b>${name}</b>
<br>Salary : <b>${salary}</b>

</body>
</html>
