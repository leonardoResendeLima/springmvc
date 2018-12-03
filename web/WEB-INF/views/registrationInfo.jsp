<%@ page import="dto.User" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>User Registration Info</title>
</head>
<body>

<h1>User registered Successfully!</h1>

<br>

<%
    User user = (User) request.getAttribute("user");
    out.println(user.getId());
    out.println(user.getEmail());
    out.println(user.getName());
%>


</body>
</html>