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
			<div class="new_prod_box">
				<a href="details.html">二折伞</a>
				<div class="new_prod_bg">
					<a href="<%=request.getContextPath()%>/product/viewProductDetail.action"><img src="<%=request.getContextPath()%>/images/customer/thumb1.gif" alt="" title="" class="thumb" border="0" />
					</a>
				</div>
			</div>
			<div class="new_prod_box">
				<a href="details.html">三折伞</a>
				<div class="new_prod_bg">
					<span class="new_icon"><img src="<%=request.getContextPath()%>/images/customer/new_icon.gif" alt="" title="" />
					</span> <a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb2.gif" alt="" title="" class="thumb" border="0" />
					</a>
				</div>
			</div>
			<div class="new_prod_box">
				<a href="details.html">四折伞</a>
				<div class="new_prod_bg">
					<span class="new_icon"><img src="<%=request.getContextPath()%>/images/customer/promo_icon.gif" alt="" title="" />
					</span> <a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb3.gif" alt="" title="" class="thumb" border="0" />
					</a>
				</div>
			</div>
			<div class="new_prod_box">
				<a href="details.html">五折伞</a>
				<div class="new_prod_bg">
					<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb1.gif" alt="" title="" class="thumb" border="0" />
					</a>
				</div>
			</div>
			<div class="new_prod_box">
				<a href="details.html">自动伞</a>
				<div class="new_prod_bg">
					<span class="new_icon"><img src="<%=request.getContextPath()%>/images/customer/promo_icon.gif" alt="" title="" />
					</span> <a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb2.gif" alt="" title="" class="thumb" border="0" />
					</a>
				</div>
			</div>
			<div class="new_prod_box">
				<a href="details.html">五折伞</a>
				<div class="new_prod_bg">
					<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb3.gif" alt="" title="" class="thumb" border="0" />
					</a>
				</div>
			</div>
			<div class="new_prod_box">
				<a href="details.html">铅笔伞</a>
				<div class="new_prod_bg">
					<span class="new_icon"><img src="<%=request.getContextPath()%>/images/customer/new_icon.gif" alt="" title="" />
					</span> <a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb2.gif" alt="" title="" class="thumb" border="0" />
					</a>
				</div>
			</div>
			<div class="new_prod_box">
				<a href="details.html">自动伞</a>
				<div class="new_prod_bg">
					<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb1.gif" alt="" title="" class="thumb" border="0" />
					</a>
				</div>
			</div>
			<div class="new_prod_box">
				<a href="details.html">四折伞</a>
				<div class="new_prod_bg">
					<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb1.gif" alt="" title="" class="thumb" border="0" />
					</a>
				</div>
			</div>
			<div class="new_prod_box">
				<a href="details.html">xxx伞</a>
				<div class="new_prod_bg">
					<span class="new_icon"><img src="<%=request.getContextPath()%>/images/customer/new_icon.gif" alt="" title="" />
					</span> <a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb1.gif" alt="" title="" class="thumb" border="0" />
					</a>
				</div>
			</div>
			<div class="new_prod_box">
				<a href="details.html">xxx伞</a>
				<div class="new_prod_bg">
					<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb1.gif" alt="" title="" class="thumb" border="0" />
					</a>
				</div>
			</div>
			<div class="pagination">
				<span class="disabled"><<</span><span class="current">1</span><a href="#?page=2">2</a><a href="#?page=3">3</a>…<a href="#?page=199">10</a><a href="#?page=200">11</a><a href="#?page=2">>></a>
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
