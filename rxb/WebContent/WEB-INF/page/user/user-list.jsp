<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<script type="text/javascript"  src="/js/jquery-1.10.0.js"></script>

<div class="container">
	<div class="row">
		<div class="col-md-10">
		
			<div class="panel panel-primary">
				
			<div class="panel-heading">所有用户</div>
			
				<div class="panel-body">
				<script type="text/javascript">
					$(function(){
						$("#all").click(function(){
							var isChecked=$("#all").is(":checked");
							if(isChecked==true){
								$("input[name='idList']").prop("checked",true);
							}else{
								$("input[name='idList']").prop("checked",false);
							}
						});
				});
				</script>
				<s:form method="post" theme="simple">
				<table class="table table-bordered table-hover table-condensed" border="1">
					<thead>
						<tr>
							<th><input id="all" type="checkbox" > 全选</th><th>用户名</th><th>状态</th><th>电话</th><th>真实姓名</th><th>所在部门</th><th>操作</th>
						</tr>
					</thead>
					<tbody>
							
						<s:iterator value="userList" var="ul">
							<tr align="center">
								
								<td align="left"><input type="checkbox" name="idList"  value="<s:property value='#ul.id'/>"></td>
								<td><s:property value="#ul.username"/></td>
								
								<td><s:property value="#ul.status"/></td>
								<td><s:property value="#ul.telephone"/></td>
								<td><s:property value="#ul.realname"/></td>
								<td><s:property value="#ul.department.name"/></td>
								<td>
									<a href="<%=request.getContextPath()%>/uform?id=${ul.id}" span class="glyphicon glyphicon-edit" title="编辑用户"></a>
									<a href="<%=request.getContextPath()%>/ustatus?id=${ul.id}" span class="glyphicon glyphicon-play" title="更改状态"></a>
									<a href="<%=request.getContextPath()%>/udelete?id=${ul.id}" span class="glyphicon glyphicon-trash" title="删除用户"></a>
									<a href="<%=request.getContextPath()%>/ureset?id=${ul.id}" span class="glyphicon glyphicon-refresh" title="重置密码"></a>
									<a href="<%=request.getContextPath()%>/auth?id=${ul.id}" span class="glyphicon glyphicon-eye-open" title="权限管理" ></a>
								</td>
						
							</tr>	
							
						</s:iterator>
						
					</tbody>
				</table>			
							<s:submit value="多选删除"  cssClass="btn-primary" action="udelete"></s:submit>
						
							<s:submit value="多选重置密码"  cssClass="btn-primary" action="ureset"></s:submit>
						
							<s:submit value="多选更改状态"  cssClass="btn-primary" action="ustatus"></s:submit>
				
				</s:form>
				<br>
				
				</div>
			</div>
			
		</div>
		<div class="col-md-2"></div>
	</div>
</div>