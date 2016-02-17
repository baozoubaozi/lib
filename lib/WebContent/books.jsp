<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书列表集合</title>
</head>
<body>
    				  <table width="100%" border="1" cellpadding="2" cellspacing="0">
    				      <tr>
    				        <td>id</td>
    				        <td>书名</td>
    				        <td>价格</td>
    				        <td>操作</td>
    				      </tr>
    				      <c:forEach items="${sessionScope.books}" var="book">
                          			<tr>
    				      				 	 <td>${book.id}</td>
    				      				  	<td>${book.bname}</td>
    				        				<td>${book.price}</td>
    				       					 <td><a href="<%=basePath%>del?id=${book.id}">删除</a></td>
    				      		    </tr>
                           </c:forEach>
    				  </table>
</body>
</html>