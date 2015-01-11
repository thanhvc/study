<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container">
	<div class="row">
		<div class="col-md-6">
		
			<div class="panel panel-primary">
				<s:if test="id!=null&&id>0">
					<div class="panel-heading">修改模块</div>
				</s:if>
				<s:else>
					<div class="panel-heading">创建新模块</div>
				</s:else>
				<div class="panel-body">
				
					<s:form action="moduleedit" method="post" theme="bootstrap">
						<s:hidden name="id" value="%{id}"></s:hidden>
						<s:textfield name="name" value="%{name}" label="模块名" placeholder="input user name."></s:textfield>
						<s:textfield name="title" value="%{title}" label="菜单名称"></s:textfield>
						<s:select list="@rxb.system.WebUtil@getModuleURLList()" name="url.id" listKey="id" listValue="name" label="模块首页"></s:select>
						<s:radio list="#{'true':'是','false':'否'}" label="是否在菜单中显示" name="mainMenu" listKey="key" listValue="value"></s:radio>
		
						<s:submit value="确定" cssClass="btn-primary"></s:submit>
						<a class="btn btn-primary" href="<%=request.getContextPath()%>/modulelist">返回列表</a>
					</s:form>
				</div>
			</div>
			
		</div>
		<div class="col-md-6"></div>
	</div>
</div>
