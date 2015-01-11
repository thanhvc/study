<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container">
	<div class="row">
		<div class="col-md-6">
		
			<div class="panel panel-primary">
				
				<div class="panel-heading">用户登录</div>
					
				<div class="panel-body">
				<s:fielderror></s:fielderror>
				<s:actionmessage/>
					<s:form action="ulogin" method="post" theme="bootstrap">
						<s:textfield name="username" value="%{username}" label="用户名" placeholder="input user name."></s:textfield>
						<s:password name="password" value="%{password}" label="密码"></s:password>
						<s:submit value="确定" cssClass="btn-primary"></s:submit>
					</s:form>
				</div>
			</div>
			
		</div>
		<div class="col-md-6"></div>
	</div>
</div>
