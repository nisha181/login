package com.cognizant.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.dao.LoginDao;
import com.cognizant.model.Login;
import com.cognizant.service.LoginService;
import com.cognizant.validate.LoginValidation;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    
    
	
	@Autowired
	private LoginValidation validation;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showLogin(ModelMap model) {
     model.addAttribute("register",new Login());
	return "login";
   }
    @RequestMapping(value="/", method=RequestMethod.POST)
	public String showWelcome(@ModelAttribute("register")Login login,BindingResult result,@RequestParam("userName")String userName,ModelMap model) {
	validation.validate(login,result);
	model.put("userName",userName);
	Login login1=new Login(login.getUserName(),login.getPassword());
	   if (result.hasErrors()) {
		   
           return "login";
           }
	   else {
		   System.out.println(login);
           if(loginService.check(login))
        	   return "welcome";
           else
        	   return "login";
	   }
      }
}

