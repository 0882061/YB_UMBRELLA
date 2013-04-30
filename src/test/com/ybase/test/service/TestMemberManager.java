/**
 * Created By: YBASE
 * Created Date: 2013-4-29 下午5:12:00
 * Author: Tom Yang
 */
package com.ybase.test.service;

import org.junit.Test;

import com.ybase.test.base.BaseTestSevice;
import com.ydev.constant.UM_Constant;
import com.ydev.domain.Member;
import com.ydev.service.app.IMemberManager;

/**
 * @author Tom Yang
 * @version 1.0
 */
public class TestMemberManager extends BaseTestSevice {

	private IMemberManager memberManager;
	
	@Test
	public void testIsUniqueMemberID() {
		String result = memberManager.isUniqueMemberID("UM0007");
		assertEquals(UM_Constant.MEM_ID_NOTUNI, result);
		
		result = memberManager.isUniqueMemberID("UM12007");
		assertEquals(UM_Constant.MEM_ID_UNI, result);

		result = memberManager.isUniqueMemberID("  ");
		assertEquals(UM_Constant.MEM_ID_NULL, result);
		
	}
	
	@Test
	public void testSaveOrUpdateMember() {
		
		Member mem = new Member();
		mem.setId("MEM0023");
		mem.setEmail("tomyang@gmail.com");
		mem.setAddress("江西省南昌市上海路");
		mem.setPassword("123456");
		mem.setTelephone("13456245635");
		
		memberManager.SaveOrUpdateMember(mem);
		
		String result = memberManager.isUniqueMemberID(mem.getId());
		assertEquals(UM_Constant.MEM_ID_NOTUNI, result);
		assertEquals(new Integer(0), mem.getIntegral());
	}

	public void setMemberManager(IMemberManager memberManager) {
		this.memberManager = memberManager;
	}
	
}
