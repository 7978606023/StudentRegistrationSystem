<%--
  Created by IntelliJ IDEA.
  User: Dipixa
  Date: 4/7/2019
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
    <link rel="stylesheet" href="resources/bootstrap.min.css"/>
    <link rel="stylesheet" href="others/register.css" />
</head>
<body>
<div id ="top">
    <form method ="Post" action="Register">
        <div class="form-group">
            <label>CWID</label>
            <input type="number" name ="CWID" class="form-control"  aria-describedby="emailHelp" placeholder="Enter CWID" required>
        </div>

        <div class="form-group">
        <label>First Name</label>
        <input type="text" name ="fName" class="form-control"  aria-describedby="emailHelp" placeholder="Enter Your first name" required>
        </div>
        <div class="form-group">
            <label>Last Name</label>
            <input type="text" name ="lName" class="form-control"  aria-describedby="emailHelp" placeholder="Enter your last name" required>
        </div>
        <div class="form-group">
            <label>Email</label>
            <input type="email" name ="email" class="form-control"  aria-describedby="emailHelp" placeholder="Enter your email" required>
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input type="password" name ="password" class="form-control"  placeholder="Please enter your Password" required>
        </div>

        <div class="form-group">
            <label for="exampleInputPassword1">Confirm Password</label>
            <input type="password" name ="password2" class="form-control" id="exampleInputPassword1" placeholder="Please confirm Password" required>
        </div>


        <button type="submit" class="btn btn-primary">Register</button>
    </form>
</div>
</body>
</html>
