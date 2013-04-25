<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="/include/customer/cus_head.jsp"></jsp:include>
<div class="center_content">

	<!-- index content start -->
	<div class="left_content">
		<div class="title">
			<span class="title_icon"><img src="<%=request.getContextPath()%>/images/customer/bullet1.gif" alt="" title="" />
			</span>注册
		</div>
		<div class="feat_prod_box_details">
			<p class="details">注册本店会员账号,xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
			<div class="contact_form">
				<div class="form_subtitle">创建账号</div>
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
						<label class="contact"><strong>电子邮箱:</strong>
						</label>
						<input type="text" class="contact_input" />
					</div>
					<div class="form_row">
						<label class="contact"><strong>手机号码:</strong>
						</label>
						<input type="text" class="contact_input" />
					</div>
					<div class="form_row">
						<label class="contact"><strong>公司名称:</strong>
						</label>
						<input type="text" class="contact_input" />
					</div>
					<div class="form_row">
						<label class="contact"><strong>住址:</strong>
						</label>
						<input type="text" class="contact_input" />
					</div>
					<div class="form_row">
						<div class="terms">
							<input type="checkbox" name="terms" />
							我同意 <a href="#">注册条款</a>
						</div>
					</div>
					<div class="form_row">
						<input type="submit" class="register" value="register" />
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
