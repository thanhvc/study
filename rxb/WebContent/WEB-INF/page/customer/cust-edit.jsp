<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container">
	<div class="row">
		<div class="col-md-6">
		
			<div class="panel panel-primary">
				<s:if test="id!=null&&id>0">
					<div class="panel-heading">客户编辑</div>
				</s:if>
				<s:else>
					<div class="panel-heading">创建客户</div>
				</s:else>
				<div class="panel-body">
					<s:form action="cedit" method="post" theme="bootstrap">
						<s:hidden name="id" value="%{id}"></s:hidden>
						<s:textfield name="name" value="%{name}" label="客户姓名"
							placeholder="input user name."></s:textfield>
						<s:textfield name="address" value="%{address}" label="地址"></s:textfield>
						<s:textfield name="contactMan" value="%{contactMan}" label="联系人"></s:textfield>
						<s:textfield name="telephone" value="%{telephone}" label="电话"></s:textfield>
						<s:textfield name="type" value="%{type}" label="类型"></s:textfield>

						<s:submit value="确定" cssClass="btn-primary"></s:submit>
						<a class="btn btn-primary" href="<%=request.getContextPath()%>/dlist">返回列表</a>
					</s:form> 
					
				</div>
			</div>
			
		</div>
	</div>
</div>