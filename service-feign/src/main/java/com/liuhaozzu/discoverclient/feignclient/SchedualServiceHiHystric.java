package com.liuhaozzu.discoverclient.feignclient;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

	@Override
	public String sayHiFromClientOne(String name) {
		return "Sorry "+name;
	}

}
