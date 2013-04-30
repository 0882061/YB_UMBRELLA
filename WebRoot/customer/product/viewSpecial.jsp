<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="/include/customer/cus_head.jsp"></jsp:include>
<div class="center_content">

	<!-- index content start -->
	<div class="left_content">
		<div class="title">
			<span class="title_icon"><img src="<%=request.getContextPath()%>/images/customer/bullet1.gif" alt="" title="" />
			</span>特价商品
		</div>
		<s:iterator value="specs" id="spec">
			<div class="feat_prod_box">
				<div class="prod_img">
					<a href="details.html"><img src="<%=request.getContextPath()%>/upload/<s:property value="#spec.picPath"/>" alt="" title="" border="0" />
					</a>
				</div>
				<div class="prod_det_box">
					<span class="special_icon"><img src="<%=request.getContextPath()%>/images/customer/special_icon.gif" alt="" title="" />
					</span>
					<div class="box_top"></div>
					<div class="box_center">
						<div class="prod_title"><s:property value="#spec.type"/></div>
						<p class="details"><s:property value="#spec.desc"/></p>
						<a href="details.html" class="more">- 详情 -</a>
						<div class="clear"></div>
					</div>
					<div class="box_bottom"></div>
				</div>
				<div class="clear"></div>
			</div>
		</s:iterator>
		<div class="pagination">
			<span <s:if test="page.startPage==1">class="disabled"</s:if>>...</span>
				<s:iterator value="page.dis" id="di">
						<a <s:if test="page.currentPage==#di">class="hoverlink"</s:if> href="<%=request.getContextPath()%>/product/viewSpecial.action?status=1&curPage=<s:property value="#di"/>&dispPg=<s:property value="page.displayPage"/>&dispRs=<s:property value="page.displayRecord" />&endPg=<s:property value="page.endPage"/>&startPg=<s:property value="page.startPage"/>"  target="_self"><s:property value="#di"/></a>
				</s:iterator>
				<span <s:if test="page.startPage==page.lastStartPage">class="disabled"</s:if>>...</span>
		</div>
		
		<div class="clear"></div>
	</div>
	<!-- index content end -->
	
	<jsp:include page="/include/customer/cus_right.jsp"></jsp:include>
	<div class="clear"></div>
</div>
<!--end of center content-->
<jsp:include page="/include/customer/cus_bottom.jsp"></jsp:include>
