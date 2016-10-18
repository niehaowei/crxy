package com.atguigu.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class TestRedis06 {
	public static void main(String[] args) {

		JedisPool jedisPool = JedisPoolUtil.getJedisPoolInstance();
		Jedis jedis = jedisPool.getResource();

		try {
			String k1 = jedis.get("k1");
			System.out.println(k1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JedisPoolUtil.release(jedisPool, jedis);
		}

	}
}
