<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="/include/customer/cus_head.jsp"></jsp:include>
<div class="center_content">

	<!-- index content start -->
	<div class="left_content">
		<div class="title">
			<span class="title_icon"><img src="<%=request.getContextPath()%>/images/customer/bullet1.gif" alt="" title="" />
			</span>购物车
		</div>
		<div class="feat_prod_box_details">
			<table class="cart_table">
				<tr class="cart_title">
					<td>预览图</td>
					<td>名称</td>
					<td>单价</td>
					<td>数量</td>
					<td>金额</td>
				</tr>
				<tr>
					<td>
						<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/cart_thumb.gif" alt="" title="" border="0" class="cart_thumb" />
						</a>
					</td>
					<td>Gift flowers</td>
					<td>100$</td>
					<td>1</td>
					<td>100$</td>
				</tr>
				<tr>
					<td>
						<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/cart_thumb.gif" alt="" title="" border="0" class="cart_thumb" />
						</a>
					</td>
					<td>Gift flowers</td>
					<td>100$</td>
					<td>1</td>
					<td>100$</td>
				</tr>
				<tr>
					<td>
						<a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/cart_thumb.gif" alt="" title="" border="0" class="cart_thumb" />
						</a>
					</td>
					<td>Gift flowers</td>
					<td>100$</td>
					<td>1</td>
					<td>100$</td>
				</tr>
				<tr>
					<td colspan="4" class="cart_total">
						<span class="red">运费:</span>
					</td>
					<td>50$</td>
				</tr>
				<tr>
					<td colspan="4" class="cart_total">
						<span class="red">总金额:</span>
					</td>
					<td>325$</td>
				</tr>
			</table>
			<a href="#" class="continue">&lt; continue</a> <a href="#" class="checkout">checkout &gt;</a>
		</div>
		
		<div class="clear"></div>
	</div>
	<!-- index content end -->
	
	<jsp:include page="/include/customer/cus_right.jsp"></jsp:include>
	<div class="clear"></div>
</div>
<!--end of center content-->
<jsp:include page="/include/customer/cus_bottom.jsp"></jsp:include>
