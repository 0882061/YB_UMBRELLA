<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="/include/customer/cus_head.jsp"></jsp:include>

<div class="center_content">
	
	<!-- index content start -->
	<div class="left_content">
		<div class="title">
			<span class="title_icon"><img src="<%=request.getContextPath()%>/images/customer/bullet1.gif" alt="" title="" />
			</span>联系
		</div>
		<div class="feat_prod_box_details">
			<p class="details">你可以发送消息至888888，把你的想法告诉xxxxxxx</p>
			<div class="contact_form">
				<div class="form_subtitle">所有栏位必填</div>
				<div class="form_row">
					<label class="contact"><strong>用户名:</strong>
					</label>
					<input type="text" class="contact_input" />
				</div>
				<div class="form_row">
					<label class="contact"><strong>电子邮箱:</strong>
					</label>
					<input type="text" class="contact_input" />
				</div>
				<div class="form_row">
					<label class="contact"><strong>手机电话:</strong>
					</label>
					<input type="text" class="contact_input" />
				</div>
				<div class="form_row">
					<label class="contact"><strong>公司名称:</strong>
					</label>
					<input type="text" class="contact_input" />
				</div>
				<div class="form_row">
					<label class="contact"><strong>消息:</strong>
					</label>
					<textarea class="contact_textarea"></textarea>
				</div>
				<div class="form_row">
					<a href="#" class="contact">发送</a>
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


