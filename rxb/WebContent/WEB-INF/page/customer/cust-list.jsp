<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<script type="text/javascript" src="/js/jquery-1.10.0.js"></script>
<script type="text/javascript">

$(function(){
	
	$("table#customer-list tbody tr").mouseover(function(){
		var tabtr=$(this);
		var id=tabtr.attr("id");
		function solveData(data){
			var tb = "<tr id=\"detail\"><td colspan=\"5\">";
			tb = tb	+ "<table border=\"1\" class=\"table table-bordered\" style=\"color: gray\">";
			tb = tb + "<tbody>\n";
			tb = tb + "<tr><td>客户详情</td><td>电话:" + data.telephone + "</td><td>地址:"
					+ data.address + "</td><td>联系人:" + data.contactMan
					+ "</td><td>类别:" + data.type + "</td></tr>\n";
			tb = tb + "</tbody></table></td></tr>";
			tabtr.after(tb);
		}
		t=setTimeout(function(){
			$.get("<%=request.getContextPath()%>/cdetail","id="+id,function(data){
				solveData(data);
			});
		},3000);
	}).mouseout(function(){
		if(t!=null){
			clearTimeout(t);
		}
		$("#detail").remove();
		
		
	});
});

</script>
<div class="container">
	<div class="row">
		<div class="col-md-10">
		
			<div class="panel panel-primary">
			
				<div class="panel-heading">客户记录</div>
				
				<div class="panel-body">
				
					<s:fielderror></s:fielderror>
				
					<table class="table table-bordered table-hover table-condensed" id="customer-list">
						<thead>
							<tr>
								<th>客户名称</th><th>联系人</th><th>电话</th><th>登记时间</th><th>操作</th>
							</tr>
						</thead>
						<tbody >
							
							<s:iterator value="@rxb.system.WebUtil@getCustomerList()" var="c" status="status">
								<tr id="${c.id}">
									<td><s:property value="#c.name"/></td>
									<td><s:property value="#c.contactMan"/></td>
									<td><s:property value="#c.telephone"/></td>
									<td><s:property value="#c.loadTime"/></td>
									<td>
										<div id="test"></div>
										<s:a action="cdelete" namespace="/">删除<s:param name="customer.id" value="#c.id"></s:param></s:a>
										<s:a action="cform" namespace="/">修改<s:param name="id" value="#c.id"></s:param></s:a>
									</td>
								</tr>
							</s:iterator>
						</tbody>
					</table>
					<s:form enctype="multipart/form-data" method="post" theme="bootstrap">
						<s:file name="doc"></s:file>
						<s:submit action="import" value="上传" cssClass="btn btn-primary"></s:submit>
						<s:submit action="download" value="导出txt" cssClass="btn btn-primary"></s:submit>
						<s:submit action="download1" value="导出excel" cssClass="btn btn-primary"></s:submit>
					</s:form>
				</div>
			</div>
			
		</div>
	</div>
</div>