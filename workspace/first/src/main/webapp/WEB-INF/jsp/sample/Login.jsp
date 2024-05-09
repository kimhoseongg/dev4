<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ include file ="/WEB-INF/include/include-header.jspf" %>
</head>
<body>
	<h2>로그인 페이지</h2>
	<form>
	아이디 : <input type="text" id="id">
	패스워드 : <input type="text" id="pw">
	<a href="#this" class="btn" id="log">login</a>
	</form> 
<%@ include file="/WEB-INF/include/include-body.jspf" %>

<script type="text/javascript">
		$(document).ready(function(){
			$("#id").on("click", function(e){ //글쓰기 버튼
				e.preventDefault();
				fn_openLogin();
			});	
		});

		function fn_openLogin()
		{
			var id = document.getElementById("id").value;
			var pw = document.getElementById("pw").value;
			
			var comSubmit = new ComSubmit();
			comSubmit.setUrl("<c:url value='/sample/openLogin.do' />");
			comSubmit.addParam("ID", id);
			comSubmit.addParam("PW", pw);
			comSubmit.submit(); 

		}
</script>
</body>
</html>