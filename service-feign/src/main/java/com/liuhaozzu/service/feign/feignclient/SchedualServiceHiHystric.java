package com.liuhaozzu.service.feign.feignclient;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

	@Override
	public String sayHiFromClientOne(String name) {
		return "Sorry "+name;
	}

}
