<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container">
	<div class="row">
		<div class="col-md-10">
		
			<div class="panel panel-primary">
					<div class="panel-heading">模块权限列表</div>
				<div class="panel-body">
				<table class="table table-bordered table-hover table-condensed" border="1">
					<thead>
						<tr>
							<th>权限名</th><th>权限描述</th><th>action</th><th>namespace</th><th>是否在菜单显示</th><th>模块</th><th>操作</th>
						</tr>
					</thead>
					<tfoot>
						<s:iterator value="moduleURLList" var="mu">
							<tr>
								<th><s:property value="#mu.name"/> </th>
								<th><s:property value="#mu.description"/></th>
								<th><s:property value="#mu.action"/></th>
								<th><s:property value="#mu.namespace"/></th>
								<th><s:property value="#mu.menu"/></th>
								<th><s:property value="#mu.module.name"/></th>
								<th>
									<a href="<%=request.getContextPath()%>/mdelete?id=${mu.id}" span class="glyphicon glyphicon-trash" title="删除权限"></a>
									<a href="<%=request.getContextPath()%>/mauth?id=${mu.id}" span class="glyphicon glyphicon-eye-open" title="用户授权"></a>
									<a href="<%=request.getContextPath()%>/mform?id=${mu.id}" span class="glyphicon glyphicon-edit" title="授权编辑"></a>
								</th>
							</tr>
						</s:iterator>
					</tfoot>
				</table>
					
				</div>
			</div>
			
		</div>
		<div class="col-md-2"></div>
	</div>
</div>