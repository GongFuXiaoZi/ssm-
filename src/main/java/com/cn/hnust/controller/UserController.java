package com.cn.hnust.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Controller
public class UserController {
 @Autowired
 private IUserService userService;
 
 @RequestMapping("/getUser")
 public ModelAndView getUser() {
	 ModelAndView model=new ModelAndView("showUser");
	 User currentUser = userService.getUserById(1);
	 model.addObject("currentUser",currentUser);
	 return model;
 }
}
