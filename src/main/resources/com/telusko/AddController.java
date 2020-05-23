package com.telusko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddController {
	
	@RequestMapping(value="/add")
 public String add() {
	 return "display.jsp";
 }
}
