package com.bjnja.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

	@Value("${nja-config.appname}")
	private String value;
	
	@GetMapping("/app-name")
	@Cacheable(value="test", key="#id")
	public String test(String id) {
		System.out.println("===="+ id);
		return "APP-NAME:" + value+ "===" + id;
	}
}
