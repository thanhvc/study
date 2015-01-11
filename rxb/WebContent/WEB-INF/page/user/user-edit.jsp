<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container">
	<div class="row">
		<div class="col-md-6">
		
			<div class="panel panel-primary">
				<s:if test="id!=null&&id>0">
					<div class="panel-heading">修改信息</div>
				</s:if>
				<s:else>
					<div class="panel-heading">创建新用户</div>
				</s:else>
				<div class="panel-body">
					<s:fielderror />
					<s:form action="uedit" method="post" theme="bootstrap">
						<s:hidden name="id" value="%{id}"></s:hidden>
						<s:textfield name="username" value="%{username}" label="用户名" placeholder="input user name."></s:textfield>
						<s:password name="password" value="%{password}" label="密码"></s:password>
						<s:password name="repassword" value="%{repassword}" label="重复密码"></s:password>
						<s:textfield name="realname" value="%{realname}" label="真实姓名"></s:textfield>
						<s:textfield name="telephone" value="%{telephone}" label="电话"></s:textfield>
						<s:radio list="#{'0':'正常','1':'锁定'}" label="状态" name="status" listKey="key" listValue="value"></s:radio>
					
						<s:select label="部门" list="@rxb.system.WebUtil@getDepartmentList()"  name="department.id"  listKey="id" listValue="name" ></s:select>
						
						<s:submit value="确定" cssClass="btn-primary"></s:submit>
						<a class="btn btn-primary" href="<%=request.getContextPath()%>/ulist">返回列表</a>
					</s:form>
				</div>
			</div>
			
		</div>
		<div class="col-md-6"></div>
	</div>
</div>
