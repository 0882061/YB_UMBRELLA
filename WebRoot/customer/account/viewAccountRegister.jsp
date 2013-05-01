<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="/include/customer/cus_head.jsp" />
<script type="text/javascript" src="<%=request.getContextPath()%>/js/common/easydialog.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/customer/account/viewAccountRegister.js"></script>
<div class="center_content">

	<!-- index content start -->
	<div class="left_content">
		<div class="title">
			<span class="title_icon"><img src="<%=request.getContextPath()%>/images/customer/bullet1.gif" alt="" title="" />
			</span>注册
		</div>
		<div class="feat_prod_box_details">
			<p class="details">注册本店会员账号,请填写以下相关信息</p>
			<div class="contact_form">
				<div class="form_subtitle">创建账号</div>
				<form name="register" action="<%=request.getContextPath()%>/account/saveMember.action" id="accountRegisterForm" method="post" >
					<ul id="errorlist"><!-- 存放驗證框架錯誤信息 --></ul>
					
					<div class="form_row">
						<label class="contact"><strong>用户名:</strong>
						</label>
						<input id="userName" name="mem.id" type="text" class="contact_input"   tabindex="1"/>
					</div>
					<div class="tip_row">
						<div id="userNameTip" style="width:235px"></div>
					</div>
					
					<div class="form_row">
						<label class="contact"><strong>密码:</strong>
						</label>
						<input type="password" id="password" name="mem.password" class="contact_input" />
					</div>
					<div class="tip_row">
						<div id="passwordTip" style="width:235px"></div>
					</div>
					
					<div class="form_row">
						<label class="contact"><strong>确认密码:</strong>
						</label>
						<input type="password" id="confirmPasswd" class="contact_input" />
					</div>
					<div class="tip_row">
						<div id="confirmPasswdTip" style="width:235px"></div>
					</div>
					
					<div class="form_row">
						<label class="contact"><strong>电子邮箱:</strong>
						</label>
						<input type="text" id="email" name="mem.email" class="contact_input" />
					</div>
					<div class="tip_row">
						<div id="emailTip" style="width:235px"></div>
					</div>
					
					<div class="form_row">
						<label class="contact"><strong>手机号码:</strong>
						</label>
						<input type="text" id="telephoneNo" name="mem.telephone" class="contact_input" />
					</div>
					<div class="tip_row">
						<div id="telephoneNoTip" style="width:235px"></div>
					</div>
					
					<div class="form_row">
						<label class="contact"><strong>住址:</strong>
						</label>
						<input type="text" id="houseAddress" name="mem.address" class="contact_input" />
					</div>
					<div class="tip_row">
						<div id="houseAddressTip" style="width:235px"></div>
					</div>
					
					<div class="form_row">
						<div class="terms">
							<input type="checkbox" name="agreeMentChk"  id="agreeMentChk"/>
							我同意 <a href="#" onclick="openAgreeMentWindow();">注册条款</a>
						</div>
					</div>
					<div class="tip_row">
						<div id="tipAgreeMentChk" style="width:235px"></div>
					</div>
					<div class="form_row">
						<input type="submit" class="register" value="注册" />
					</div>
				</form>
			</div>
		</div>
		
		<!-- Start 会员须知面板  -->
			<jsp:include page="/customer/account/viewAgreeMent.jsp" />
		<!-- end 会员须知面板  -->
		<div class="clear"></div>
	</div>
	<!-- index content end -->
	
	<jsp:include page="/include/customer/cus_right.jsp"></jsp:include>
	<div class="clear"></div>
</div>
<!--end of center content-->
<jsp:include page="/include/customer/cus_bottom.jsp"></jsp:include>
<script type="text/javascript">
<s:if test="alertStatus=='success'">
	alertAddMemSuccess("<s:property value="mem.userName"/>");
</s:if>
<s:elseif test="alertStatus=='error'">
	alertAddMemError("<s:property value="mem.userName"/>");
</s:elseif>
</script>