<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container">
	<div class="row">
		<div class="col-md-10">
		
			<div class="panel panel-primary">
				
			<div class="panel-heading">所有模块</div>
			
				<div class="panel-body">


				<table class="table table-bordered table-hover table-condensed" border="1">
					<thead>
						<tr>
							<th>模块名</th><th>title</th><th>是否显示</th><th>首页</th><th>操作</th>
						</tr>
					</thead>
					<tbody>
							
						<s:iterator value="moduleList" var="m">
							<tr >
				
								<td><s:property value="#m.name"/></td>
								<td><s:property value="#m.title"/></td>
								<td><s:property value="#m.mainMenu"/></td>
								<td><s:property value="#m.url.name"/></td>
								<td>
									<a href="<%=request.getContextPath()%>/moduleform?id=${m.id}" span class="glyphicon glyphicon-edit" title="编辑权限"></a>
								</td>
						
							</tr>	
							
						</s:iterator>
						
					</tbody>
				</table>			

				<br>
				</div>
			</div>
			
		</div>
	</div>
</div>