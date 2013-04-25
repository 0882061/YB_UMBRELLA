var LIST_USER_PATH = context_path + "/sampleJson/ajaxListUser.action";
function ajaxListUser() {
	var params = {};
	$j.ajax({
		type : "post",
		url : LIST_USER_PATH,
		data : params,
		async : false,
		dataType : "text",
		success : function(json) {
			json = eval("(" + json.substring(json.indexOf("\/\*") + 2, json.lastIndexOf("\*\/")) + ")");

			var now = json.now;
			$j("#curDate").text(now);
			
			// var users = json.userList;
			var users = json.users;
			var exmapleUserTab = $j("#exmapleUserTabs");
			var trs = $j("#exmapleUserTabs tr:not(tr:has(th))");
			if (trs.length > 0) {
				trs.remove();
			}
			if (users.length > 0) {
				generateTd(users, exmapleUserTab);
			} else {
				return;
			}
		},
		error : function() {
			alert("error");
		}
	})
}

/**
 * =========================
 * generate td
 * ==========================
 */
function generateTd(users, tabs) {
	$j.each(users, function() {
		var td_uid = $j("<td/>").text(this.id);
		var td_uname = $j("<td/>").text(this.name);
		var td_usex = $j("<td/>").text(this.sex);
		var td_usysUser = $j("<td/>").text(this.sysUser);
		$j("<tr/>").append(td_uid).append(td_uname).append(td_usex).append(td_usysUser).appendTo(tabs);
	})
}