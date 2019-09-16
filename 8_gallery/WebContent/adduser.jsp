<%@page import="vo.UserVo"%>
<%@page import="service.UsersServiceImpl"%>
<%@page import="service.UsersService"%>
<%@page import="dao.UsersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF_8">
<title>adduser.jsp</title>
</head>
<body>
<h3>회 원 가 입 처 리</h3>

<%

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String role = request.getParameter("role");
	
	UsersDao dao = new UsersDao();
	UsersService service = new UsersServiceImpl(dao);
	
	UserVo vo = new UserVo();
	vo.setId(id);
	vo.setName(name);
	vo.setPassword(pw);
	vo.setRole(role);
	
	int c = service.addUsers(vo);
	
	
%>

입력정보:<%=id %>/ <%= pw %>/<%=name %>/<%= role %>


<%
	if(c == 0 ){
%>

<h4>회 원 가 입 실 패 
<%
}
%>
<br>
<a href="index.html">home으로</a>
</body>
</html>