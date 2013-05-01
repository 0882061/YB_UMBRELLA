<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="/include/customer/cus_head.jsp"></jsp:include>

<div class="center_content">
	
	<!-- index content start -->
	<div class="left_content">
        <div class="title">
        	<span class="title_icon"><img src="<%=request.getContextPath()%>/images/customer/bullet1.gif" alt="" title="" /></span>关于我们
        </div>
        <div class="feat_prod_box_details">
            <p class="details">
            <img src="<%=request.getContextPath()%>/images/customer/shop.jpg" alt="" title="" class="right" /><s:property value="introduce"/></p>
        </div>	 
        
        <div class="clear"></div>
    </div>
	<!-- index content end -->
	
	<jsp:include page="/include/customer/cus_right.jsp"></jsp:include>
	<div class="clear"></div>
</div>
<!--end of center content-->
<jsp:include page="/include/customer/cus_bottom.jsp"></jsp:include>


