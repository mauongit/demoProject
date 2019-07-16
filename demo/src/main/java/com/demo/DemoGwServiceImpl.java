package com.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DemoGwServiceImpl implements DemoService{

	@Override
	public String getData() {
		
		return "GW Data";
	}

	
}
