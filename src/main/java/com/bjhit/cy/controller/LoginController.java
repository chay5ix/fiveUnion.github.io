package com.bjhit.cy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(value="/validate",method=RequestMethod.POST)
	public String validate(String name,String pass,HttpServletRequest req,HttpServletResponse resp){
		
		String result = "";
		if(("chen").equals(name)&&("123456").equals(pass)){
			req.setAttribute("name", name);
			result= "WEB-INF/test/success";
		}else{
			result = "WEB-INF/test/failure";
		}
		return result;
	}
}
