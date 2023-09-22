package com.icia.sweethome.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminController")
public class AdminController {
	
	private static Logger logger = LoggerFactory.getLogger(SellerController .class);
	
	@RequestMapping(value = "/admin/main")
	public String main(Model model, HttpServletRequest request, HttpServletResponse response) {
		
		
		return "/admin/main";
	}
}
