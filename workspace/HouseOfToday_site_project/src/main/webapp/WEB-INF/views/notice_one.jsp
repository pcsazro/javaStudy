<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물</title>

</head>
<body>
	<jsp:include page="../../top.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<div style="margin: auto;" >
			<div class="col-lg-11 col-md-6 mb-4" style="margin-top: 5px;">
				<form action="notice_insert.do" style="text-align: left; margin: 10px;">
				<!-- notice_delete.do로 변경 -->
					제  목<br>
					<input type="text" style="width: 100%;" disabled="disabled" value="${ndto.ntitle}"><br>
					내  용<br>
					<textarea rows="15" cols="100" style="width: 100%" disabled="disabled" >${ndto.ncontent}</textarea><br>
					<div style="margin-bottom: 10px">
						<img src="<spring:url value='/notice_image/${ndto.fileName}' />" style="width: 80%; height: 80%">
					</div>
					<button class="btn-primary btn-lg" type="button" onclick="location.href='notice_one2.do?nid=${ndto.nid}'">수  정</button>
					<button class="btn-primary btn-lg" type="button" onclick="location.href='notice_delete.do?nid=${ndto.nid}'">삭  제</button>
					<button class="btn-primary btn-lg" type="button" onclick="location.href='notice_list.jsp'">돌아가기</button>
				</form>
			</div>
			</div>
		</div>
	</div>
	<jsp:include page="../../bottom.jsp"></jsp:include>
</body>
</html>