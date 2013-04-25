<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Sample</title>
<jsp:include page="/include/page_head.jsp"></jsp:include>
</head>
<body>
	<div style="text-align: center;">
		<font style="color: red;size: 1.5em;">用户不存在!</font>
		<input type="button" onclick="javascript:history.back();" value="返回" />
	</div>
	<br>
</body>
</html>
