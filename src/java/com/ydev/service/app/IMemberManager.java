/**
 * Created By: YBASE
 * Created Date: 2013-4-29 下午4:45:06
 * Author: Tom Yang
 */
package com.ydev.service.app;

import com.ydev.domain.Member;

/**
 * @author Tom Yang
 * @version 1.0
 */
public interface IMemberManager {

	public Member getMember();
	
	public void SaveOrUpdateMember(Member mem);

	/**
	 * @param mem
	 */
	public String isUniqueMemberID(String memID);
}
