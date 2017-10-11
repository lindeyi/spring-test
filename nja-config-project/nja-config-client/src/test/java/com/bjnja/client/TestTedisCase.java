package com.bjnja.client;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;

public class TestTedisCase extends AppTest{

	@Resource
	private RedisTemplate<String, String> redisTemplate;
	
	@Test
	public void set() {
		redisTemplate.opsForValue().set("aaa", "bbb");
	}
	
	@Test
	public void get() {
		System.out.println(redisTemplate.opsForValue().get("aaa"));
	}
}
