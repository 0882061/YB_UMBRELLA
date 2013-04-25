<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="/include/customer/cus_head.jsp"></jsp:include>

<div class="center_content">
	
	<!-- index content start -->
	<div class="left_content">
		<div class="title">
			<span class="title_icon"><img src="<%=request.getContextPath()%>/images/customer/bullet1.gif" alt="" title="" />
			</span>特色商品
		</div>
		<s:iterator value="fenewPros"  id="pro"  status="idx">
			<s:if test="#pro.status==1">
				<div class="feat_prod_box">
				<div class="prod_img">
					<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/prod1.gif" alt="" title="" border="0" />
					</a>
				</div>
				<div class="prod_det_box">
					<div class="box_top"></div>
					<div class="box_center">
						<div class="prod_title"><s:property value="#pro.type"/></div>
						<p class="details"><s:property value="#pro.desc"/></p>
						<a href="details.html" class="more">- 详情 -</a>
						<div class="clear"></div>
					</div>
					<div class="box_bottom"></div>
				</div>
				<div class="clear"></div>
			</div>
		</s:if>
		</s:iterator>
		<div class="title">
			<span class="title_icon"><img src="<%=request.getContextPath()%>/images/customer/bullet2.gif" alt="" title="" />
			</span>新品上架
		</div>
		<div class="new_products">
			<div class="new_prod_box">
				<a href="details.html">product name</a>
				<div class="new_prod_bg">
					<span class="new_icon"><img src="<%=request.getContextPath()%>/images/customer/new_icon.gif" alt="" title="" />
					</span> <a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb1.gif" alt="" title="" class="thumb" border="0" />
					</a>
				</div>
			</div>
			<div class="new_prod_box">
				<a href="details.html">product name</a>
				<div class="new_prod_bg">
					<span class="new_icon"><img src="<%=request.getContextPath()%>/images/customer/new_icon.gif" alt="" title="" />
					</span> <a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb2.gif" alt="" title="" class="thumb" border="0" />
					</a>
				</div>
			</div>
			<div class="new_prod_box">
				<a href="details.html">product name</a>
				<div class="new_prod_bg">
					<span class="new_icon"><img src="<%=request.getContextPath()%>/images/customer/new_icon.gif" alt="" title="" />
					</span> <a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb3.gif" alt="" title="" class="thumb" border="0" />
					</a>
				</div>
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


