package com.individual.Controller;


import java.security.Principal;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.individual.Utils.WebUtils;

@Controller
public class UserController {
	@RequestMapping(value = {"/user/profile"},method = RequestMethod.GET)
	public String UserInfor() {
		return "user/profile";
	}
	@RequestMapping(value = {"/user/dashboard"},method = RequestMethod.GET)
	public String UserDashBoard() {
		return "user/dashboard";
	}
}
