<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: U557571
  Date: 17/09/2019
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login </title>
</head>
<body>
<%--    <h1>Pharmacie <s:text name="info.company.name" /></h1>--%>

    <form action="loginaction"  namespace="/" method="post">
        <div class="imgcontainer">
            <img src="" alt="logo" >
        </div>

        <div class="container">
            <label for="username"><b>Username</b></label>
            <input type="text" placeholder="Enter Username" id ="username" name="username" required>

            <label for="psw"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" id="psw" name="psw" required>

            <button type="submit">Login</button>
            <label>
                <input type="checkbox" checked="checked" name="remember"> Remember me
            </label>
        </div>

        <s:if test="hasActionErrors()">
            <div id="fieldErrors">
                <s:actionerror/>
            </div>
        </s:if>

        <div class="container" >
            <button type="button">Cancel</button>
        </div>
    </form>
</body>
</html>
