package com.example.springbootbasics.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

//	@RequestMapping("hello")
//	public String sayHello(HttpSession session, HttpServletResponse res, HttpServletRequest req) {
//		System.out.println("Hello !!!!!");
//		System.out.println(this.toString());
//		System.out.println(req);
//		System.out.println(res);
//		System.out.println(session);
//		return "hello";
//	}
	
	
	@RequestMapping("hello")
	public String sayHello(HttpSession session, String name) {
		System.out.println("Hello !!!!!");
		System.out.println(this.toString());
		System.out.println("Name: " + name);
		session.setAttribute("name", name);
		System.out.println("Session: " + session);
		return "hello";
	}
	
}
