<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!doctype html>  
<html>  
<head>  
<meta charset="utf-8"/>  
<script>  




var ws = new WebSocket("ws://<%=request.getLocalAddr()%>:<%=request.getLocalPort()%><%=request.getContextPath()%>/websocket/${sid}");  


//var ws = new WebSocket("ws://192.168.16.152:8000/websocket/websocket/zhangsan");

//var ws = new WebSocket("ws://127.0.0.1:8000/websocket/websocket/zhangsan"); 
  
ws.onopen = function(){  
    alert("连接成功");  
}  
  
ws.onmessage = function(msg) {   
	
    if(msg.data) {  
        var p = document.createElement("p");  
        p.innerHTML = "msg:" + msg.data;  
        document.getElementById("x").appendChild(p);  
    };   
  
}  

function sendData(){  
    ws.send(document.getElementById("msg").value);  
}  
  
  
</script>  
</head>  
<body>  
  
<input type="text" id="msg"/>  
<input type="button" value="send" id="s" onclick="sendData()"/>  
<div id="x">  
</div>  
</body>  
</html>  