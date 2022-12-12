package com.loginpage.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.loginpage.model.Login;
import com.loginpage.service.LoginServices;

@Controller
public class LoginController {

	@Autowired
	private LoginServices loginServices;
	
	@GetMapping("/login")
	public ModelAndView login()
	{
		ModelAndView view=new ModelAndView("login");
		view.addObject("user", new Login());
		return view;
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("user") Login user) {

		Login oauthUser = loginServices.login(user.getUsername(), user.getPassword());

		System.out.print(oauthUser);
		if (Objects.nonNull(oauthUser)) {

			return "redirect:/";

		} else {
			return "redirect:/login";

		}
	}

}
