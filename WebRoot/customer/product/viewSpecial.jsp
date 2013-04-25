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
		<div class="feat_prod_box">
			<div class="prod_img">
				<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/prod1.gif" alt="" title="" border="0" />
				</a>
			</div>
			<div class="prod_det_box">
				<span class="special_icon"><img src="<%=request.getContextPath()%>/images/customer/special_icon.gif" alt="" title="" />
				</span>
				<div class="box_top"></div>
				<div class="box_center">
					<div class="prod_title">三折伞</div>
					<p>
						嗨! 欢迎使用<strong>巴巴唔模板网</strong>提供的网页模板,你可以免费将此模板应用与任何地方,个人网站或者商业应用,唯一需要做的就是在此页面保留<a href="http://www.88web.org">巴巴唔模板网</a>的相关链接.或加入友情链接
					</p>
					<a href="details.html" class="more">- 详情 -</a>
					<div class="clear"></div>
				</div>
				<div class="box_bottom"></div>
			</div>
			<div class="clear"></div>
		</div>
		<div class="feat_prod_box">
			<div class="prod_img">
				<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/prod2.gif" alt="" title="" border="0" />
				</a>
			</div>
			<div class="prod_det_box">
				<span class="special_icon"><img src="<%=request.getContextPath()%>/images/customer/special_icon.gif" alt="" title="" />
				</span>
				<div class="box_top"></div>
				<div class="box_center">
					<div class="prod_title">四折伞</div>
					<p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
						exercitation.</p>
					<a href="details.html" class="more">- 详情 -</a>
					<div class="clear"></div>
				</div>
				<div class="box_bottom"></div>
			</div>
			<div class="clear"></div>
		</div>
		<div class="feat_prod_box">
			<div class="prod_img">
				<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/prod1.gif" alt="" title="" border="0" />
				</a>
			</div>
			<div class="prod_det_box">
				<span class="special_icon"><img src="<%=request.getContextPath()%>/images/customer/special_icon.gif" alt="" title="" />
				</span>
				<div class="box_top"></div>
				<div class="box_center">
					<div class="prod_title">自动伞</div>
					<p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
						exercitation.</p>
					<a href="details.html" class="more">- 详情 -</a>
					<div class="clear"></div>
				</div>
				<div class="box_bottom"></div>
			</div>
			<div class="clear"></div>
		</div>
		<div class="feat_prod_box">
			<div class="prod_img">
				<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/prod2.gif" alt="" title="" border="0" />
				</a>
			</div>
			<div class="prod_det_box">
				<span class="special_icon"><img src="<%=request.getContextPath()%>/images/customer/special_icon.gif" alt="" title="" />
				</span>
				<div class="box_top"></div>
				<div class="box_center">
					<div class="prod_title">铅笔伞</div>
					<p class="details">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
						exercitation.</p>
					<a href="details.html" class="more">- 详情 -</a>
					<div class="clear"></div>
				</div>
				<div class="box_bottom"></div>
			</div>
			<div class="clear"></div>
		</div>
		<div class="pagination">
			<span class="disabled"><<</span><span class="current">1</span><a href="#?page=2">2</a><a href="#?page=3">3</a>…<a href="#?page=199">10</a><a href="#?page=200">11</a><a href="#?page=2">>></a>
		</div>
		
		<div class="clear"></div>
	</div>
	<!-- index content end -->
	
	<jsp:include page="/include/customer/cus_right.jsp"></jsp:include>
	<div class="clear"></div>
</div>
<!--end of center content-->
<jsp:include page="/include/customer/cus_bottom.jsp"></jsp:include>
