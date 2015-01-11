<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container">
	<div class="row">
		<div class="col-md-6">
		
			<div class="panel panel-primary">
				<div class="panel-heading">错误信息</div>
				<div class="panel-body">
					<s:property value="exception.message"/>
				</div>
			</div>
			
		</div>
		<div class="col-md-6"></div>
	</div>
</div>