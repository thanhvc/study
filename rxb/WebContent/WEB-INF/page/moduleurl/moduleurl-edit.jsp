<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container">
	<div class="row">
		<div class="col-md-6">
		
			<div class="panel panel-primary">
				<s:if test="id!=null&&id>0">
					<div class="panel-heading">修改权限信息</div>
				</s:if>
				<s:else>
					<div class="panel-heading">创建新权限</div>
				</s:else>
				<div class="panel-body">
			
					<s:form action="medit" method="post" theme="bootstrap">
						<s:hidden name="id" value="%{id}"></s:hidden>
						<s:textfield name="name" value="%{name}" label="权限名" placeholder="input user name."></s:textfield>
						<s:textarea name="description" value="%{description}" label="权限描述"></s:textarea>
						<s:textfield name="action" value="%{[0].action}" label="action"></s:textfield>
						<s:textfield name="namespace" value="%{namespace}" label="namespace"></s:textfield>
						<s:select list="@rxb.system.WebUtil@getModuleList()" name="module.id" listKey="id" listValue="name" label="模块"></s:select>
						<s:radio name="menu" list="#{'true':'是','false':'否'}" listKey="key" listValue="value" label="是否显示"></s:radio>
						

						<s:submit value="确定" cssClass="btn-primary"></s:submit>
					</s:form>
				</div>
			</div>
			
		</div>
		<div class="col-md-6"></div>
	</div>
</div>