package com.atguigu.redis;

import redis.clients.jedis.Jedis;

public class TestRedis05 {

	public static void main(String[] args) throws InterruptedException {

		Jedis jedisMaster = new Jedis("127.0.0.1", 6379);
		Jedis jedisSlave = new Jedis("127.0.0.1", 6380);
		
		String k1 = jedisSlave.get("k1");
		System.out.println("**************"+k1);
		
		jedisSlave.slaveof("127.0.0.1", 6379);
		jedisMaster.set("k1", "Hello Redis");
		 Thread.sleep(1000);
		
		k1 = jedisSlave.get("k1");
		System.out.println("$$$$$$$$$$$$$$"+k1);
		
	}

}
