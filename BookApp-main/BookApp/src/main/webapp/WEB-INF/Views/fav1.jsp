<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Favorite</title>
</head>
<body bgcolor="teal">
<center>
<font size="5dp" fontfamily="courier" >
<h1>FAVORITES</h1>
 <table style="border: solid 2px red" >
  <thead style="border: solid 2px red">
   <tr style="border: solid 2px red">
    <th>Id</th>
    <th>Name</th>
    <th>Genera</th>
    <th>Author</th>
   </tr>
  </thead>
     <tbody>
			<c:forEach items="${list}" var="a">
				<tr style="border: solid 2px red">
					<td>${a.id}</td>
					<td>${a.name}</td>
					<td>${a.genera}</td>
					<td>${a.authorname}</td>	
				</tr>
			</c:forEach>
		</tbody>
 </table>
 <a href="/BookApp"><button>HOME</button></a>
 <a href="/fav"><button>Reload</button></a>
 <br><br>
</body>
</html>