<%@page import="vo.UserVo"%>
<%@page import="service.UsersServiceImpl"%>
<%@page import="service.UsersService"%>
<%@page import = "dao.UsersDao" %>
<%@ page language="java" contentType="text/html; charset=UTF8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
<h3>login 처리</h3>
<!-- java code 영역 -->
<%


String id = request.getParameter("id");
String pw = request.getParameter("pw");

UsersDao dao = new UsersDao();
UsersService service = new UsersServiceImpl(dao);

UserVo vo = new UserVo();
vo.setId(id);
vo.setPassword(pw);
UserVo data = service.login(vo);

%>

로그인 정보: <%= data %>

<p>
<a href="index.html">Home으로</a>
</body>
</html>