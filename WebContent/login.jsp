<%--
  Created by IntelliJ IDEA.
  User: Dipixa
  Date: 4/7/2019
  Time: 12:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" href="resources/bootstrap.min.css"/>
<link rel="stylesheet" href="others/login.css" />

<div id="main" class="container">
    <form action="Login" method="post">
        <div class="form-group">
            <label>CWID</label>
            <input type="number" name ="CWID" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter CWID" required>
            <small id="emailHelp" class="form-text text-muted">We'll never share your cwid with anyone else.</small>
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input type="password" name ="password" class="form-control" id="exampleInputPassword1" placeholder="Password" required>
        </div>

        <button type="submit" class="btn btn-primary">Log In</button>
    </form>
</div>
