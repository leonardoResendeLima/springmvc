<%@ page import="java.util.ArrayList" %>
<%@ page import="dto.Employee" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<%
    ArrayList<Employee> employees = (ArrayList<Employee>) request.getAttribute("employees");
    for(Employee e : employees){
        out.println(e.getId());
        out.println(e.getName());
        out.println(e.getSalary());
    }
%>

</body>
</html>