<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내일의 집 - 공지사항</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">

$(document).ready(function() {
	$.ajax({
		url: "notice_list_all.do",
		success: function(result) {
			$(".contents").append(result)
			console.log(result)
		}
	})
})

</script>
</head>
<body>
	<jsp:include page="top.jsp"></jsp:include>
	<!-- Page Content -->
	<h1 align="center" style="margin-bottom: 10px;">N o t i c e</h1>
	<div class="container" align="center">	
		<div class="row" align="center" style="margin: auto;">
			<button class="btn-primary btn-lg" onclick="location.href='notice_insert.jsp'" style="margin: 5px; margin-left: 30px;">글쓰기</button>
		</div>	
		<div class="contents"></div>
	</div>
	<!-- /container -->
	<jsp:include page="bottom.jsp"></jsp:include>
</body>
</html>