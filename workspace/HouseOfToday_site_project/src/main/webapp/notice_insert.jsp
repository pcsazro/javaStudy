<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 생성</title>

<%
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String datestr = sdf.format(cal.getTime());
%>
</head>
<body>
	<jsp:include page="top.jsp"></jsp:include>

	<div align="center" class="container">
		<div style="margin-top: 5px;">
			<form action="notice_insert.do" method="post"
				enctype="multipart/form-data" accept-charset="UTF-8"
				style="text-align: left; margin: 10px;">
				<label>제 목</label> <input type="text" style="width: 100%;"
					name="ntitle"><br> <br> <label>내 용</label>
				<textarea rows="15" cols="100" name="ncontent" style="width: 100%"></textarea>

				<div class="inputArea">
					<label for="fileName">이미지</label> <input type="file" id="fileName"
						name="file" />
					<div class="select_img">
						<img src="" />
					</div>
				</div>
				<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
				<script type="text/javascript">
					$("#fileName").change(
							function() {
								if (this.files && this.files[0]) {
									var reader = new FileReader;
									reader.onload = function(data) {
										$(".select_img img").attr("src",
												data.target.result).width(500);
									}
									reader.readAsDataURL(this.files[0]);
								}
							});
				</script>
				
				<%=request.getRealPath("/") %>
				
				<br> <input type="text" value="a" name="mid"
					style="visibility: hidden;">
				<!-- 마지막에 세션값으로 변경 -->
				<input type="text" name="date" value="<%=datestr%>"
					style="visibility: hidden;"> <br>
				<button class="btn-primary btn-lg" type="submit" style="margin: 3px;">작성</button>
				<button class="btn-primary btn-lg" type="button" style="margin: 3px;"
					onclick="location.href='notice_list.jsp'">돌아가기</button>
			</form>
		</div>
	</div>

	<jsp:include page="bottom.jsp"></jsp:include>

</body>
</html>