package com.govind.hellowolrddemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
	@RequestMapping(value= {"","/","/home"})
	public String index() {
		return "Hello From Perfios Software Solution";
	}
}
