<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!-- 登录面板 -->
		<div class="easyDialog_wrapper" id=loginPanel style="width:400px;height:300px;">
			<div class="easyDialog_content" style="width:400px;height:300px;">
				<h4 class="easyDialog_title" id="easyDialogTitle" style="margin-top:0px;">
					<a href="javascript:void(0)" title="关闭窗口" class="close_btn" id="loginPanelCloseBtn">&times;</a>
					会员登录
				</h4>
				<div style="width:400px;height:210px;padding-top:0px;margin:0px;">
				<fieldset style="border:1px solid #ccc;padding:0px;margin:20px;" >
				  <table style="width:100%;">
					<tr>
					  <td style="width:120px;text-align: right;">编号:</td>
					  <td><input type="text" size="10" name="" class="input-text" value="L00001"/></td>
					</tr>
					<tr>
					  <td style="width:70px;text-align: right;">密码:</td>
					  <td><input type="text" size="10" name="" class="input-text" value="L00001"/></td>
					</tr>
					<tr>
					  <td style="width:70px;text-align: right;">验证码:</td>
					  <td><input type="text" size="10" name="" class="input-text" value="L00001"/></td>
					</tr>
					<tr>
					  <td style="width:70px;text-align: right;"></td>
					  <td style="text-align: right;"><a>忘记密码</a></td>
					</tr>
				  </table>
				  </fieldset>
				</div>
				<div class="easyDialog_footer">
					<button class="btn_normal" id="easyDialogNoBtn">取消</button>
					<button class="btn_highlight" id="easyDialogYesBtn">确定</button>
				</div>
			</div>
		</div>

		