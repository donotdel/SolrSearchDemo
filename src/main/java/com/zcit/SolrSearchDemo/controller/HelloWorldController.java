package com.zcit.SolrSearchDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zcit.SolrSearchDemo.model.UserVO;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String index(){
		return "Hello World!";
	}
	
	@RequestMapping("/getUser")
	public UserVO getUser(){
		UserVO userVO = new UserVO();
		userVO.setAge("28");
		userVO.setName("zhangweitao");
		return userVO;
	}
	
}
