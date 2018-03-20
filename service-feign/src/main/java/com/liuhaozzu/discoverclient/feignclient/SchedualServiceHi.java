package com.liuhaozzu.discoverclient.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback=SchedualServiceHiHystric.class )
public interface SchedualServiceHi {
	
	@GetMapping("/hi")
	public String sayHiFromClientOne(@RequestParam("name") String name);
}
