<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>SSH</title>
<jsp:include page="/include/page_head.jsp"></jsp:include>
</head>
<body>
	<div style="text-align: center;">
		<jsp:include page="/include/page_error.jsp"></jsp:include>
		<form action="<%=request.getContextPath()%>/sample/sample.action" method="post">
			<font>用户编号:</font>
			<input type="text" name="user.id" />
			<input type="submit" value="提交" />
			<input type="reset" value="重置" />
		</form>
		<a href="<%=request.getContextPath()%>/security/viewSaveUser.action">添加用户</a>
	</div>
	<div>
		<input type="button" value="ajaxUser" onclick="ajaxListUser();" /><font id="curDate"></font>
		<table id="exmapleUserTabs" class="tab_01">
			<tr class="header">
				<th>用户编号</th>
				<th>用户名</th>
				<th>用户性别</th>
				<th>系统用户</th>
			</tr>
		</table>
	</div>
</body>
</html>