package com.atguigu.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolUtil {
	private static volatile JedisPool jedisPool;

	private JedisPoolUtil() {
	}

	public static JedisPool getJedisPoolInstance() {
		if (jedisPool == null) {
			synchronized (JedisPoolUtil.class) {
				if (jedisPool == null) {
					JedisPoolConfig poolConfig = new JedisPoolConfig();
					poolConfig.setMaxActive(1000);
					poolConfig.setMinIdle(15);
					poolConfig.setMaxWait(100 * 1000);
					poolConfig.setTestOnBorrow(true);

					jedisPool = new JedisPool(poolConfig, "127.0.0.1");
				}
			}
		}
		return jedisPool;
	}

	public static void release(JedisPool jedisPool,Jedis jedis) {
		if(jedis!=null){
			jedisPool.returnResource(jedis);
		}
	}
}
