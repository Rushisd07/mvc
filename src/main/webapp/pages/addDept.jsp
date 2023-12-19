<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<form action="./pages/add_dept_bean_store.jsp">
		<input type="text" name="deptName" placeholder="dept_Name"/>
		<input type="submit" value=" ADD DEPARTMENT "/>
	
	</form>
</body>
</html>