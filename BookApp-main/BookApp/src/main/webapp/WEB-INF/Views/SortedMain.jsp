<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="teal">
<center>
<h1>WELCOME</h1>
<h1>Sorted Books.....</h1>
<font size="5dp" fontfamily="courier" >

<a href="/BookApp"><button>main</button></a>
<a href="/fav"><button>Fav</button></a>
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
					<td> <a href="fav/${a.id}">Addfav</a></td>
				</tr>
			</c:forEach>
		</tbody>
 </table>
 <br><br>
 

</font>

</body>

</html>