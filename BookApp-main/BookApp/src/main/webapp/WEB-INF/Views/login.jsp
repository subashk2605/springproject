<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SIGN-UP</title>
</head>
<body bgcolor="teal">
<div align="center",width="warp-content",bgcolor="grey">
<h1>Login Page</h1>

<align="center" >
<font size="5dp" fontfamily="courier" >

<form:form method="post" action="adduser"  modelAttribute="user">
   </br></br>    <form:label path="name">Full name :</form:label>
            <form:input path="name"/><br/><br/>

<form:label path="ph">Phone no. :</form:label>
            <form:input path="ph"/><br/><br/>

<form:label path="email">Email     : </form:label>
            <form:input path="email"/><br/><br/>

<form:label path="pass">Password :</form:label>
            <form:input path="pass"/><br/><br/>
             
   <form:button>Login</form:button> <br/><br/>
<br>
<a href="/index">Already have a account</a>
</form:form>

</font>
</align>
</div>
</body>

</html>