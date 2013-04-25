<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="/include/customer/cus_head.jsp"></jsp:include>
<div class="center_content">

	<!-- index content start -->
	<div class="left_content">
		<div class="title">
			<span class="title_icon"><img src="<%=request.getContextPath()%>/images/customer/bullet1.gif" alt="" title="" />
			</span>我的账号
		</div>
		<div class="feat_prod_box_details">
			<p class="details">如果还没有注册的话，请注册本店账号，Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis
				nostrud. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.</p>
			<div class="contact_form">
				<div class="form_subtitle">账号登陆</div>
				<form name="register" action="#">
					<div class="form_row">
						<label class="contact"><strong>用户名:</strong>
						</label>
						<input type="text" class="contact_input" />
					</div>
					<div class="form_row">
						<label class="contact"><strong>密码:</strong>
						</label>
						<input type="text" class="contact_input" />
					</div>
					<div class="form_row">
						<div class="terms">
							<input type="checkbox" name="terms" />
							记住密码
						</div>
					</div>
					<div class="form_row">
						<input type="submit" class="register" value="login" />
					</div>
				</form>
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
