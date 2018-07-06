package com.thd.websocket.service;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/checkcenter")
public class CheckCenterController {

    //页面请求
    @GetMapping("/socket/{cid}")
    public ModelAndView socket(@PathVariable String cid) {
        ModelAndView mav=new ModelAndView("/socket");
        mav.addObject("cid", cid);
        return mav;
    }
    //推送数据接口
    @ResponseBody
    @RequestMapping("/socket/push/{cid}")
    public WebSocketDto pushToWeb(@PathVariable String cid,String message) {  
    	WebSocketDto dto = new WebSocketDto();
    	dto.setStatus("SUCCESS");
        try {
            WebSocketServer.sendInfo(message,cid);
            dto.setMessage(cid+"#"+message + " return");
        } catch (IOException e) {
            e.printStackTrace();
            dto.setMessage(cid+"#"+e.getMessage());
            return dto;
        }  
        return dto;
    } 
} 