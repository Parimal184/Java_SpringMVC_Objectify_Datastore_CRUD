package com.example.gcp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.gcp.demo.model.User;
import com.example.gcp.demo.service.UserService;

@Controller
public class UserController {
	
	private UserService service = new UserService();
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public String saveUser(@RequestBody User user) {
		service.saveUser(user);
		return "OK";
	}
	
}
