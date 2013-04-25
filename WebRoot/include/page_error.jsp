<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<div>
	<s:if test="hasActionErrors() || hasFieldErrors()">
		<ul>
			<s:iterator value="fieldErrors">
				<li><s:property value="value" /></li>
			</s:iterator>
			<s:iterator value="actionErrors">
				<li><s:property value="top" /></li>
			</s:iterator>
	</s:if>
</div>