<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="/include/customer/cus_head.jsp"></jsp:include>
<div class="center_content">

	<!-- index content start -->
	<div class="left_content">
		<div class="crumb_nav">
			<a href="index.html">首页</a> &gt;&gt; 商品详情
		</div>
		<div class="title">
			<span class="title_icon"><img src="<%=request.getContextPath()%>/images/customer/bullet1.gif" alt="" title="" />
			</span>自动伞
		</div>
		<div class="feat_prod_box_details">
			<div class="prod_img">
				<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/prod1.gif" alt="" title="" border="0" />
				</a> <br />
				<br /> <a href="<%=request.getContextPath()%>/images/customer/big_pic.jpg" rel="lightbox"><img src="<%=request.getContextPath()%>/images/customer/zoom.gif" alt="" title="" border="0" />
				</a>
			</div>
			<div class="prod_det_box">
				<div class="box_top"></div>
				<div class="box_center">
					<div class="prod_title">详情</div>
					<p class="details">自动伞的按键是一键操作，上面有打开和收起的标示，其实是一个键，使用时只要按下按键，伞面就会自动弹开，使用完毕再按下按钮，伞面会自动收回，这个时候 伞柄还没有完全收到底，继续双手按压伞的两端，收到底会有啪的声音，可以感觉到按扣合紧，这个时候伞完全收回。</p>
					<div class="price">
						<strong>价格:</strong> <span class="red">60 元</span>
					</div>
					<div class="price">
						<strong>颜色:</strong> <span class="colors"><img src="<%=request.getContextPath()%>/images/customer/color1.gif" alt="" title="" border="0" />
						</span> <span class="colors"><img src="<%=request.getContextPath()%>/images/customer/color2.gif" alt="" title="" border="0" />
						</span> <span class="colors"><img src="<%=request.getContextPath()%>/images/customer/color3.gif" alt="" title="" border="0" />
						</span>
					</div>
					<a href="details.html" class="more"><img src="<%=request.getContextPath()%>/images/customer/order_now.gif" alt="" title="" border="0" />
					</a>
					<div class="clear"></div>
				</div>
				<div class="box_bottom"></div>
			</div>
			<div class="clear"></div>
		</div>
		<div id="demo" class="demolayout">
			<ul id="demo-nav" class="demolayout">
				<li><a class="active" href="#tab1">更多详情</a>
				</li>
				<li><a class="" href="#tab2">相关商品</a>
				</li>
			</ul>
			<div class="tabs-container">
				<div style="display: block;" class="tab" id="tab1">
					<p class="more_details">请一定严格按照使用步骤操作，不要用手强制收回，这样会损伤弹簧，而且无法再次开启。 另外要注意不要朝有人的方向弹开，也要避开贵重物品和玻璃，因为毕竟是弹簧产品，要防止弹簧因使用寿命或其他原因弹出去伤到人。正常的弹簧使用寿命是5000次，但是为了安全，还是要做到避开这些安全隐患。
						有买家使用自动开收伞会觉得按钮很紧，这样设计是为防止伞柄握在手中的时候不小心碰到按钮打开或收起雨伞，所以按钮是有点紧而不会轻易碰到就弹开，不是 产品质量问题。有MM反映最后一步收回的时候要用较大力，这是因为弹簧弹出的弹力比较大，那么相应收回的时候也要用较大的力气，其实一般吃过早餐的话，这点力气都是没问题的哦。</p>
					<ul class="list">
						<li><a href="#">商品xx</a>
						</li>
						<li><a href="#">商品xxx</a>
						</li>
						<li><a href="#">商品xxx</a>
						</li>
						<li><a href="#">商品xxx</a>
						</li>
					</ul>
					<p class="more_details">更多详情....</p>
				</div>
				<div style="display: none;" class="tab" id="tab2">
					<div class="new_prod_box">
						<a href="details.html">遮阳伞</a>
						<div class="new_prod_bg">
							<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb1.gif" alt="" title="" class="thumb" border="0" />
							</a>
						</div>
					</div>
					<div class="new_prod_box">
						<a href="details.html">xxx伞</a>
						<div class="new_prod_bg">
							<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb2.gif" alt="" title="" class="thumb" border="0" />
							</a>
						</div>
					</div>
					<div class="new_prod_box">
						<a href="details.html">铅笔伞</a>
						<div class="new_prod_bg">
							<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb3.gif" alt="" title="" class="thumb" border="0" />
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
						<a href="details.html">三折伞</a>
						<div class="new_prod_bg">
							<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb2.gif" alt="" title="" class="thumb" border="0" />
							</a>
						</div>
					</div>
					<div class="new_prod_box">
						<a href="details.html">自动伞</a>
						<div class="new_prod_bg">
							<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb3.gif" alt="" title="" class="thumb" border="0" />
							</a>
						</div>
					</div>
					<div class="clear"></div>
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
