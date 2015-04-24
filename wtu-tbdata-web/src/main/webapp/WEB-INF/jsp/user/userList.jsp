<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>用户列表页</title>
</head>
<body>
	输入用户：<s:property value="user.username"/>
	<br/>
	<table>
		<tr><td>ID</td><td>用户名</td><td>密码</td></tr>
		<s:iterator value="%{list}" id="user" status="status">
			<tr><td><s:property value="#user.id"/></td><td><s:property value="#user.username"/></td><td><s:property value="#user.password"/></td></tr>
		</s:iterator>
	</table>
</body>
</html>