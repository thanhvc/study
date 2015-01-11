<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<nav class="navbar navbar-primary navbar-fixed-top" role="navigation">
	<div class="collapse navbar-collapse">
		<ul class="nav navbar-nav">
			
			<li><s:a action="uloginform" namespace="/">登录</s:a></li>
			
			<s:iterator value="#session.MODULE" var="m">
				<s:if test="#m.mainMenu==true">
				<li><s:a action="%{#m.url.action}" namespace="%{#m.url.namespace}" title="%{#m.title}"><s:property value="#m.name"/></s:a></li>
				</s:if>
			</s:iterator>
		</ul>
		
		<s:form cssClass="navbar-form navbar-right" theme="bootstrap">
			<s:textfield name="key"></s:textfield>
			<s:submit value="Search" cssClass="btn-default" />
		</s:form>
		<ul class="nav navbar-nav navbar-right">
		  <li class="dropdown">
		  	<a class="dropdown-toggle" data-toggle="dropdown" href="#">Dropdown <span class="caret"></span></a>
		  	<ul class="dropdown-menu">
		  		<li><a href="<%=request.getContextPath() %>/ulist">Action one</a>
		  		<li><a href="<%=request.getContextPath() %>/dlist">Action two</a>
		  		<li><a href="<%=request.getContextPath() %>/clist">Action three</a>
		  	</ul>
		  </li>
		</ul>
	</div>
</nav>