<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="row">
	<c:forEach items="${nlist}" var="dto">
		<div class="col-lg-4 col-md-6 mb-4" onclick="location.href='notice_one.do?nid=${dto.nid}'">
			<div class="card h-100" align="left">
				<a href="#">
					<img class="card-img-top" 
						src="<spring:url value='/notice_image/${dto.fileName}' />" 
							style="width: 300px; height: 300px" alt="">
				</a>
				<div class="card-body">
					<h4 class="card-title">
						<a href="#">${dto.ntitle}</a>
					</h4>
					<h5>${dto.mid}</h5>
				</div>
				<div class="card-footer">
					<small class="text-muted">${dto.date}</small>
				</div>
			</div>
			<input type="text" value="${dto.nid}" name="nid"
					style="visibility: hidden;">
		</div>
	</c:forEach>
</div>