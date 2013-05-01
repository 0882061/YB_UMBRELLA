var url_request_memUnique = context_path + "/accountJson/ajaxRequestMemUnique.action";
$j(document).ready(function(){
	$j("#userName").focus();
	$j.formValidator.initConfig({
		formID:"accountRegisterForm",
		debug:false,
		submitOnce:true,
		onError:function(msg,obj,errorlist){
			$j("#errorlist").empty();
			$j.map(errorlist,function(msg){
				$j("#errorlist").append("<li>" + msg + "</li>")
			});
			alert(msg);
		},
		submitAfterAjaxPrompt : '\u6709\u6570\u636e\u6b63\u5728\u5f02\u6b65\u9a8c\u8bc1\uff0c\u8bf7\u7a0d\u7b49...'
	});
	
	//用戶名驗證
	$j("#userName").formValidator({onShow:"\u8bf7\u8f93\u5165\u7528\u6237\u540d!",onFocus:"\u7528\u6237\u540d\u81f3\u5c115\u4e2a\u5b57\u7b26,\u6700\u591a10\u4e2a\u5b57\u7b26",onCorrect:"\u8be5\u7528\u6237\u540d\u53ef\u4ee5\u6ce8\u518c"}).inputValidator({min:5,max:10,onError:"\u4f60\u8f93\u5165\u7684\u7528\u6237\u540d\u975e\u6cd5,\u8bf7\u786e\u8ba4"})
	.ajaxValidator({
		type : "post",
		dataType : "text",
		async : true,
		url : url_request_memUnique,
		success : function(json){
			var val = $j("#userName").val();
			json = eval("(" + json.substring(json.indexOf("\/\*") + 2, json.lastIndexOf("\*\/")) + ")");
			var result = json.result;
			if(result!=undefined && result!=null){
				if(result == "success"){
					return true;
				}else if(result == "error"){
					return false
				}else if(result == "idNull"){
					return false
				}
			}else{
				return false;
			}
		},
		error: function(jqXHR, textStatus, errorThrown){alert("\u670d\u52a1\u5668\u6ca1\u6709\u8fd4\u56de\u6570\u636e\uff0c\u53ef\u80fd\u670d\u52a1\u5668\u5fd9\uff0c\u8bf7\u91cd\u8bd5"+errorThrown);},
		onError : "\u8be5\u7528\u6237\u540d\u4e0d\u53ef\u7528\uff0c\u8bf7\u66f4\u6362\u7528\u6237\u540d",
		onWait : "\u6b63\u5728\u5bf9\u7528\u6237\u540d\u8fdb\u884c\u5408\u6cd5\u6027\u6821\u9a8c\uff0c\u8bf7\u7a0d\u5019..."
		});
	
	//密碼驗證
	$j("#password")
	.formValidator({
		onShow:"\u8bf7\u8f93\u5165\u5bc6\u7801",
		onFocus:"\u81f3\u5c116\u4e2a\u957f\u5ea6",
		onCorrect:"\u5bc6\u7801\u5408\u6cd5"})
	.inputValidator({
		min:1,
		empty:{leftEmpty:false,
			   rightEmpty:false,
			   emptyError:"\u5bc6\u7801\u4e24\u8fb9\u4e0d\u80fd\u6709\u7a7a\u7b26\u53f7"
			  },
		onError:"\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a,\u8bf7\u786e\u8ba4"
	});
	
	//密碼確認
	$j("#confirmPasswd")
	.formValidator({
		onShow:"\u8f93\u518d\u6b21\u8f93\u5165\u5bc6\u7801",
		onFocus:"\u81f3\u5c116\u4e2a\u957f\u5ea6",
		onCorrect:"\u5bc6\u7801\u4e00\u81f4"})
	.inputValidator({
		min:1,
		empty:{
			leftEmpty:false,
			rightEmpty:false,
			emptyError:"\u91cd\u590d\u5bc6\u7801\u4e24\u8fb9\u4e0d\u80fd\u6709\u7a7a\u7b26\u53f7"},
			onError:"\u91cd\u590d\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a,\u8bf7\u786e\u8ba4"})
	.compareValidator({
		desID:"password",
		operateor:"=",
		onError:"2\u6b21\u5bc6\u7801\u4e0d\u4e00\u81f4,\u8bf7\u786e\u8ba4"});
	
	//email驗證
	$j("#email")
	.formValidator({
		onShow:"\u8bf7\u8f93\u5165\u90ae\u7bb1",
		onFocus:"\u8bf7\u8f93\u5165\u90ae\u7bb1",
		onCorrect:"\u606d\u559c\u4f60,\u4f60\u8f93\u5bf9\u4e86",
		defaultValue:"@"})
	.inputValidator({
		min:6,
		max:100,
		onError:"\u4f60\u8f93\u5165\u7684\u90ae\u7bb1\u957f\u5ea6\u975e\u6cd5,\u8bf7\u786e\u8ba4"})
	.regexValidator({
		regExp:"^([\\w-.]+)@(([[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.)|(([\\w-]+.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(]?)$",
		onError:"\u4f60\u8f93\u5165\u7684\u90ae\u7bb1\u683c\u5f0f\u4e0d\u6b63\u786e"});
	
	//电话号码验证
	$j("#telephoneNo").formValidator({
		onShow:"\u7535\u8bdd\u957f\u5ea6\u4e3a11\u4f4d",
		onFocus:"\u8bf7\u8f93\u5165\u8054\u7cfb\u7535\u8bdd",
		onCorrect:"\u8054\u7cfb\u7535\u8bdd\u683c\u5f0f\u6b63\u786e",
	}).inputValidator({
		type:"size",
		min:"11",
		min:"11",
		onError:"\u683c\u5f0f\u9519\u8bef",
	});
	
	//地址验证
	$j("#houseAddress")
	.formValidator({
		onShow:"\u8bf7\u8f93\u5165\u5730\u5740",
		onFocus:"\u8bf7\u8f93\u5165\u5730\u5740",
		onCorrect:"\u5730\u5740\u683c\u5f0f\u6b63\u786e",
		defaultValue:"\u6c5f\u897f\u7701\u5357\u660c\u5e02\u4e0a\u6d77\u8defxxx\u53f7"})
	.functionValidator({
		fun:function(val,elem){
	        if(val=="\u6c5f\u897f"){
			    return true;
		    }else{
			    return "\u683c\u5f0f\u932f\u8aa4";
		    }
		},
		onError:"\u683c\u5f0f\u932f\u8aa4"
	})
	
	$j(":checkbox[name='agreeMentChk']").formValidator({tipID:"tipAgreeMentChk",onShow:"\u8bf7\u9605\u8bfb\u6ce8\u518c\u6761\u6b3e",onFocus:"",onCorrect:""}).inputValidator({min:1,onError:"\u8bf7\u9605\u8bfb\u6ce8\u518c\u6761\u6b3e"});
	
})

function openAgreeMentWindow(){
	easyDialog.open({
		container : 'regAgrPanel',
		autoClose : 0,
		fixed : false,
		drag : false
	});
	
	$j("#regAgrPanelCloseBtn").bind("click",function(){
		   easyDialog.close();
	    });
}

function validateAddress(){
	alert("外部函數調用");
	return true;
}

function alertAddMemSuccess(userName){
	easyDialog.open({
		container : {
			header : '\u63d0\u793a',
			content : '\u4f1a\u5458\u7f16\u53f7:'+userName+',\u6dfb\u52a0\u6210\u529f!',
			yesFn : function(){return true;},
			noFn : true,
			drag : false
	    }
	  });
}

function alertAddMemError(userName){
	easyDialog.open({
		container : {
			header : '\u9519\u8bef',
			content :'\u4f1a\u5458\u7f16\u53f7:'+userName+',\u6dfb\u52a0\u5931\u8d25!',
			yesFn : function(){return true;},
			noFn : true,
			drag : false
	    }
	  });
}