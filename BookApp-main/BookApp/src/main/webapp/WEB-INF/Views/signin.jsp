<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signin</title>
</head>
<body bgcolor="teal">
<div align="center",width="warp-content",bgcolor="grey">
<h1>SIGN-IN</h1>

<align="center" >
<font size="5dp" fontfamily="courier" >

<form action="check">
</br><input type="text" name="user" placeholder="Name"/>
</br></br>
<input type="password" name="pass" placeholder="Password"/>
</br></br>
<button>submit</button></form></br>
<a href="/login"><button>login</button></a></br></br>
<h3>${errorMsg}</h3>
</font>
</align>
</div>

</body>
</html>