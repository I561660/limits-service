package com.anthony.microservices.limitsService.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anthony.microservices.limitsService.bean.LimitConfiguration;
import com.anthony.microservices.limitsService.configuration.Configuration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromConfigurations() {
		
		String maximum = configuration.getMaximum();
		String minimum = configuration.getMinimum();
		
		
		return new LimitConfiguration(Integer.parseInt(minimum), Integer.parseInt(minimum));
	}
}
