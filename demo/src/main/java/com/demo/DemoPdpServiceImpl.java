package com.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DemoPdpServiceImpl implements DemoService{

	@Override
	public String getData() {
		
		return "PDP Data";
	}

	
}
