<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../../top.jsp"></jsp:include>
	<div class="row">
		<div class="col-lg-4 col-md-6 mb-4" align="center"  style="margin: auto;">
			<br>
			<button class="btn-success btn-lg" 
				onclick="location.href='notice_list.jsp'">
			메인으로
			</button>
			<br>
		</div>
	</div>
	<jsp:include page="../../bottom.jsp"></jsp:include>
</body>
</html>