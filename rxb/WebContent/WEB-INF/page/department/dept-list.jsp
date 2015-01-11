<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container">
	<div class="row">
		<div class="col-md-10">

			<div class="panel panel-primary">

				<div class="panel-heading">部门列表</div>

				<div class="panel-body">
					<table border="1"
						class="table table-bordered table-hover table-condensed">
						<thead>
							<tr>
								<th>部门名称</th>
								<th>部门地址</th>
								<th>管理员</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<s:iterator value="departmentList" var="dl">
								<tr>
									<th><s:property value="#dl.name" /></th>
									<th><s:property value="#dl.address" /></th>
									<th><s:property value="#dl.manager.username" /></th>
									<th><a span class="glyphicon glyphicon-trash" title="删除"
										href="<%=request.getContextPath() %>/ddelete?id=${dl.id}"></a>

										<a span class="glyphicon glyphicon-edit" title="编辑"
										href="<%=request.getContextPath() %>/dform?id=${dl.id}"></a></th>
								</tr>
							</s:iterator>
						</tbody>
					</table>
				</div>
			</div>

		</div>
		<div class="col-md-2"></div>
	</div>
</div>