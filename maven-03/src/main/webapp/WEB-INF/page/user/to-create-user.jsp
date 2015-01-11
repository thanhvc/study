<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>创建用户</title>
</head>
<body>
<form action="create-user.action" method="post">
	<table>
		<tr>
			<th>用户名：</th><td><input name="username" type="text"/></td>
		</tr>
		<tr>
			<th>密码：</th><td><input name="password" type="password"/></td>
		</tr>
		<tr>
			<th>真实姓名：</th><td><input name="realname" type="text"/></td>
		</tr>
		<tr>
			<td colspan="2"><input value="确定" type="submit"/></td>
		</tr>
	</table>
</form>
</body>
</html>