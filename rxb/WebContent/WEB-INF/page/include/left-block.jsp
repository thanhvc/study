<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="panel panel-primary">
  <div class="panel-heading">菜单栏</div>
  
  <s:iterator value="#request.MODULEURL" var="u">
  	<s:if test="#u.menu==true">
  		<div class="panel-body" ><s:a Class="list-group-item" action="%{#u.action}" namespace="%{#u.namespace}"><s:property value="#u.name"/></s:a></div>
  	</s:if>
  </s:iterator>
</div>