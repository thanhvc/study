<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
{
"name":"<s:property value="%{customer.name}"/>",
"telephone":"<s:property value="%{customer.telephone}"/>",
"address":"<s:property value="%{customer.address}"/>",
"contactMan":"<s:property value="%{customer.contactMan}"/>",
"type":"<s:property value="%{customer.type}"/>"
}