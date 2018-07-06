package com.thd.websocket.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/websocket")
public class WebsocketController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	@RequestMapping(value="/index")
	public String index(HttpServletRequest request){
		HttpSession session = request.getSession();
		request.setAttribute("sid", session.getId());
		log.info(" index()... ");
		return "index";
	}
}
