<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>SSH</title>
<jsp:include page="/include/page_head.jsp"></jsp:include>
</head>
<body>
	<div>
		<jsp:include page="/include/page_error.jsp"></jsp:include>
		<font>添加用户:</font>
		<form action="<%=request.getContextPath()%>/security/saveUser.action" method="post">
			<font>姓名</font><input type="text" name="user.name" /><br /> 
			<font>性别</font>
			<select name="user.sex">
				<option value="1" selected="selected">男</option>
				<option value="2">女</option>
			</select><br /> 
			<font>系统用户</font>
			<input type="radio" value="false" name="user.sysUser" checked="checked"/>普通用户
			<input type="radio" value="true" name="user.sysUser" />系统用户
			<br />
			<input type="submit" value="添加" />
			<input type="reset" value="重置" />
		</form>
		<a href="<%=request.getContextPath()%>/sample/viewSample.action">返回</a>
	</div>
	<br>
</body>
</html>
