package com.atguigu.redis;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class TestRedis02 {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		Set<String> set = jedis.keys("*");
		for (String str : set) {
			System.out.println(str);
		}
	}
}
