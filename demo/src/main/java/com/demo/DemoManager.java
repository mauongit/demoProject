package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoManager {
	
	@Autowired
	DemoGwServiceImpl gwService;
	
	@Autowired
	DemoPdpServiceImpl pdpService;
	
	public String getGwData() {	
	return gwService.getData();	
	}
	
	public String getPdpData() {	
		return pdpService.getData();	
		}

}
