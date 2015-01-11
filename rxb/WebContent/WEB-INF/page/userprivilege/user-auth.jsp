<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<script type="text/javascript" src="/js/jquery-1.10.0.js"></script>
<script type="text/javascript">
	$(function() {
		$("#all").click(function() {
			var isChecked = $("#all").is(":checked");
			if (isChecked == true) {
				$("input[name='midList']").prop("checked", true);
			} else {
				$("input[name='midList']").prop("checked", false);
			}
		});
	});
</script>
<div class="container">
	<div class="row">
		<div class="col-md-6">

			<div class="panel panel-primary">
				<div class="panel-heading">用户权限列表</div>
				<div class="panel-body">

					<s:form method="post" theme="simple">
						<s:hidden value="%{id}" name="userId"></s:hidden>
						<table class="table table-bordered table-hover table-condensed"
							border="1">

							<thead>
								<tr>
									<th><input type="checkbox" id="all" >全选</th>
									<th>权限名</th>
									<th>权限描述</th>
									<th>权限级别</th>
								</tr>
							</thead>
							<tfoot>
								<s:iterator value="list" var="l">
									
									<tr>
										<td><input type="checkbox" name="midList"
											value="<s:property value='#l[0].id'/>"></td>
										<td><s:property value="#l[0].name" />
											
										<td><s:property value="#l[0].description" />
											
										<td><s:property value="#l[1].mask" /></td>
									</tr>
								</s:iterator>
							</tfoot>
						</table>
						<s:submit action="upedit" value="授权"></s:submit>
						<s:submit action="revoke" value="去权"></s:submit>
					</s:form>
				</div>
			</div>

		</div>
		<div class="col-md-6"></div>
	</div>
</div>