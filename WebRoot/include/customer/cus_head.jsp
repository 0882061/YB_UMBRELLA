<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<jsp:include page="/include/customer/page_cus_head.jsp"></jsp:include>
<body>
<div id="wrap">
	<div class="header">
       	<div class="logo"><a href="index.html"><img src="<%=request.getContextPath()%>/images/customer/logo.gif" alt="" title="" border="0" /></a></div>            
        <div id="menu">
            <ul>
				<li class="selected"><a href="<%=request.getContextPath()%>/index.action">首页</a>
				</li>
				<li><a href="<%=request.getContextPath()%>/product/viewProduct.action">雨伞商品</a>
				</li>
				<li><a href="<%=request.getContextPath()%>/product/viewSpecial.action">特价礼品</a>
				</li>
				<li><a href="<%=request.getContextPath()%>/account/viewAccountLogin.action">账号</a>
				</li>
				<li><a href="<%=request.getContextPath()%>/account/viewAccountRegister.action">注册</a>
				</li>
				<li><a href="<%=request.getContextPath()%>/aboutUs/viewAboutUs.action">关于我们</a>
				</li>
				<li><a href="<%=request.getContextPath()%>/contactUs/viewContactUs.action">联系</a>
				</li>
			</ul>
        </div>            
    </div>

