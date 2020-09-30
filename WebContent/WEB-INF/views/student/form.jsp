<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"   %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<base href="${ pageContext.servletContext.contextPath }/" />
</head>
<body>
	<form:form action="student/save" method="post">
		<div>
		Nhập tên:
		<input name="name">
		</div>
		<hr/>
		<div>
		Điểm:
		<input name="mark">
		</div>
		<hr/>
		<div>
		Ngành:
		<label>
<input name="major" type="radio" value="APP"/>
Ứng dụng phần mềm
</label>
<label>
<input name="major" type="radio" value="WEB"/>
Thiết kế trang web
</label>
		<hr/>
		<button>Xác nhận</button>
	</form:form>
</body>
</html>