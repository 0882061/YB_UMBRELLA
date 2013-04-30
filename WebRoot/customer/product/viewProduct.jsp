<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="/include/customer/cus_head.jsp"></jsp:include>
<div class="center_content">

	<!-- index content start -->
	<div class="left_content">
		<div class="crumb_nav">
			<a href="index.html">首页</a> &gt;&gt; 雨伞商品
		</div>
		<div class="title">
			<span class="title_icon"><img src="<%=request.getContextPath()%>/images/customer/bullet1.gif" alt="" title="" />
			</span>商品种类
		</div>
		<div class="new_products">
			<s:iterator value="pros" id="pro">
				<div class="new_prod_box">
					<a href="details.html"><s:property value="#pro.type"/></a>
					<div class="new_prod_bg">
						<a href="<%=request.getContextPath()%>/product/viewProductDetail.action"><img src="<%=request.getContextPath()%>/upload/<s:property value="#pro.picPath"/>" alt="" title="" class="thumb" border="0"  width="112"  height="100" />
						</a>
					</div>
				</div>
			</s:iterator>
			<div class="pagination">
				<span <s:if test="page.startPage==1">class="disabled"</s:if>>...</span>
				<s:iterator value="page.dis" id="di">
						<a <s:if test="page.currentPage==#di">class="hoverlink"</s:if> href="<%=request.getContextPath()%>/product/viewProduct.action?status=1&curPage=<s:property value="#di"/>&dispPg=<s:property value="page.displayPage"/>&dispRs=<s:property value="page.displayRecord" />&endPg=<s:property value="page.endPage"/>&startPg=<s:property value="page.startPage"/>"  target="_self"><s:property value="#di"/></a>
				</s:iterator>
				<span <s:if test="page.startPage==page.lastStartPage">class="disabled"</s:if>>...</span>
			</div>
		</div>
		
		<div class="clear"></div>
	</div>
	<!-- index content end -->
	
	<jsp:include page="/include/customer/cus_right.jsp"></jsp:include>
	<div class="clear"></div>
</div>
<!--end of center content-->
<jsp:include page="/include/customer/cus_bottom.jsp"></jsp:include>
