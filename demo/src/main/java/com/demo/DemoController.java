package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/demo")
public class DemoController {

	DemoManager mgr;
	
	@RequestMapping("/gwUrl")
	public String getGwJson(@RequestParam(value = "gw", defaultValue = "apple") String param) {
		
		return mgr.getGwData();
		
	}
	
	@RequestMapping("/pdpUrl")
	public String getPdpJson(@RequestParam(value = "pdp", defaultValue = "iphone") String param) {
		
		return mgr.getPdpData();
		
	}
}
