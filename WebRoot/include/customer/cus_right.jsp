<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<div class="right_content">
	<div class="languages_box">
		<span class="red">Languages:</span> <a href="#" class="selected"><img src="<%=request.getContextPath()%>/images/customer/gb.gif" alt="" title="" border="0" />
		</a> <a href="#"><img src="<%=request.getContextPath()%>/images/customer/fr.gif" alt="" title="" border="0" />
		</a> <a href="#"><img src="<%=request.getContextPath()%>/images/customer/de.gif" alt="" title="" border="0" />
		</a>
	</div>
	<div class="currency">
		<span class="red">Currency: </span> <a href="#">GBP</a> <a href="#">EUR</a> <a href="#" class="selected">USD</a>
	</div>
	<div class="cart">
		<div class="title">
			<span class="title_icon"><img src="<%=request.getContextPath()%>/images/customer/cart.gif" alt="" title="" />
			</span>购物车
		</div>
		<div class="home_cart_content">
			3 件 商品 | <span class="red">消费金额: 100元</span>
		</div>
		<a href="<%=request.getContextPath()%>/cart/viewCart.action" class="view_cart">查看购物车</a>
	</div>
	<div class="title">
		<span class="title_icon"><img src="<%=request.getContextPath()%>/images/customer/bullet3.gif" alt="" title="" />
		</span>商店信息
	</div>
	<div class="about">
		<p>
			<img src="<%=request.getContextPath()%>/images/customer/about.gif" alt="" title="" class="right" />网店的想法就是赚钱，许多人都认为充值赚不了多少钱？首先我先解释下，你买Q币会只买一个吗？你玩一种网络游戏点卡就只是充值一次就不玩了？
			你的手机就充值一次话费？开充值网店主要不是为了靠充值发财（虽然有，但很少）最主要的目的就是为了提高信誉，有了信誉以后不管你卖什么商品都容易多了，有了信誉以后就算你改行了那些收藏你网店的人他们一样有可能看到你网店里面的其他商品，开充值网店除了增加信誉，同时还增加了人气，人气才是无价的。
		</p>
	</div>
	<div class="right_box">
		<div class="title">
			<span class="title_icon"><img src="<%=request.getContextPath()%>/images/customer/bullet4.gif" alt="" title="" />
			</span>促销商品
		</div>
		<div class="new_prod_box">
			<a href="details.html">三折伞</a>
			<div class="new_prod_bg">
				<span class="new_icon"><img src="<%=request.getContextPath()%>/images/customer/promo_icon.gif" alt="" title="" />
				</span> <a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb1.gif" alt="" title="" class="thumb" border="0" />
				</a>
			</div>
		</div>
		<div class="new_prod_box">
			<a href="details.html">五折伞</a>
			<div class="new_prod_bg">
				<span class="new_icon"><img src="<%=request.getContextPath()%>/images/customer/promo_icon.gif" alt="" title="" />
				</span> <a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb2.gif" alt="" title="" class="thumb" border="0" />
				</a>
			</div>
		</div>
		<div class="new_prod_box">
			<a href="details.html">铅笔伞</a>
			<div class="new_prod_bg">
				<span class="new_icon"><img src="<%=request.getContextPath()%>/images/customer/promo_icon.gif" alt="" title="" />
				</span> <a href="details.html"><img src="<%=request.getContextPath()%>/images/customer/thumb3.gif" alt="" title="" class="thumb" border="0" />
				</a>
			</div>
		</div>
	</div>
	<div class="right_box">
		<div class="title">
			<span class="title_icon"><img src="<%=request.getContextPath()%>/images/customer/bullet5.gif" alt="" title="" />
			</span>类别
		</div>
		<ul class="list">
			<li><a href="#">普通</a>
			</li>
			<li><a href="#">特价</a>
			</li>
			<li><a href="#">热卖</a>
			</li>
			<li><a href="#">促销</a>
			</li>
			<li><a href="#">xxx</a>
			</li>
			<li><a href="#">xxxx</a>
			</li>
		</ul>
		<div class="title">
			<span class="title_icon"><img src="<%=request.getContextPath()%>/images/customer/bullet6.gif" alt="" title="" />
			</span>合作伙伴
		</div>
		<ul class="list">
			<li><a href="#">天堂伞业有限公司</a>
			</li>
			<li><a href="#">正德伞业有限公司</a>
			</li>
			<li><a href="#">杭州xx伞业有限公司</a>
			</li>
			<li><a href="#">厦门xxx伞业有限公司</a>
			</li>
			<li><a href="#">xxxx有限公司</a>
			</li>
			<li><a href="#">xxxxxx有限公司</a>
			</li>
		</ul>
	</div>
</div>
<!--end of right content-->