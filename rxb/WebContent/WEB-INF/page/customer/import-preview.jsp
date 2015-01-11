<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="container">
	<div class="row">
		<div class="col-md-6">
		
			<div class="panel panel-primary">
				<div class="panel-heading">预览页面</div>
				<div class="panel-body">
					<table  class="table table-bordered table-hover table-condensed"
							border="1">
						<thead>
							<tr>
								<th>客户名</th><th>类型</th><th>电话</th><th>联系人</th><th>地址</th>
							</tr>
						</thead>
						<tbody>
							<s:iterator value="#session.CUSTOMERS" var="c">
								<tr>
									<td><s:property value="#c.name"/></td>
									<td><s:property value="#c.type"/></td>
									<td><s:property value="#c.telephone"/></td>
									<td><s:property value="#c.contactMan"/></td>
									<td><s:property value="#c.address"/></td>
								</tr>
							</s:iterator>
						</tbody>
					</table>
					<s:form theme="bootstrap">
						<s:submit action="importCustomer" value="确定" cssClass="btn btn-primary"></s:submit>
						<s:submit action="cancel" value="取消" cssClass="btn btn-primary"></s:submit>
					</s:form>
				</div>
			</div>
			
		</div>
		<div class="col-md-6"></div>
	</div>
</div>