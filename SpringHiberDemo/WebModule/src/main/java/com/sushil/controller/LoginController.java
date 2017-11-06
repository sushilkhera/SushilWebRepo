package com.sushil.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sushil.bean.LoginBean;
import com.sushil.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	@Qualifier("loginServiceImpl")
	private LoginService loginService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loadLoginPage(Model model){
		return "login";
	}
	
	@RequestMapping(value="/loginSubmit",method=RequestMethod.POST)
	public ModelAndView loginAuthentication(Model model, @ModelAttribute("loginBean") LoginBean loginBean){
		System.out.println("User Name from DB:"+loginService.loginAuthenticate().getuName());
		System.out.println("loginBean.getUserId()::"+loginBean.getUserId());
		model.addAttribute("loggedInUser",loginBean.getUserId());
		return new ModelAndView("home");
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	
	
}
