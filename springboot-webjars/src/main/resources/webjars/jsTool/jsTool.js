(function(){
	
	var tool = {
		msg : function(str){
			alert(str);
		},
		show : (url) => {
			window.open(url);
		},
		close : function(){
			window.close();
		}
	}
	
	return tool;
	
})()