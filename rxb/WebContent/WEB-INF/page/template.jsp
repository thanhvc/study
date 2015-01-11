<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<% request.setAttribute("contextPath", request.getContextPath()); %>    
<!DOCTYPE html>
<html lang="en">
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="<s:property value="#request.contextPath"/>/css/bootstrap.min.css" rel="stylesheet">
	<link href="<s:property value="#request.contextPath"/>/css/bootstrap-theme.min.css" rel="stylesheet">
	<link href="<s:property value="#request.contextPath"/>/css/crm-layout.css" rel="stylesheet">
	<script type="text/javascript" src="<s:property value="#request.contextPath"/>/js/jquery-1.10.0.min.js"></script>
	<script type="text/javascript" src="<s:property value="#request.contextPath"/>/js/bootstrap.min.js"></script>

	<title>首页</title>
</head>
<body>
	<div class="container">
		<s:include value="%{#request.topLocation}" />
	</div>
	
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-3">
			    <!-- the left content -->
				<s:include value="%{#request.leftLocation}"></s:include>
			</div>
			<div class="col-lg-9">
				<!-- the main content -->
				<s:include value="%{#request.contentLocation}"/>
	       </div>
		</div>
	</div>
	
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-12">
				<!-- the footer content -->
				<s:include value="%{#request.footerLocation}" />
			</div>
		</div>
	</div>
</body>
</html>