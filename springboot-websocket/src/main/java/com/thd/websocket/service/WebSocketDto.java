package com.thd.websocket.service;

public class WebSocketDto {
	//成功:SUCCESS  失败:FAILURE   参见StaticVar.STATUS_xxx
		private String status;
		
		//消息  请求后返回的说明
		private String message;
		
		//返回值
		private Object result;

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Object getResult() {
			return result;
		}

		public void setResult(Object result) {
			this.result = result;
		}
	
}
