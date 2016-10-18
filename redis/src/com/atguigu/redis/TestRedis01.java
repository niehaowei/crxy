package com.atguigu.redis;

import redis.clients.jedis.Jedis;

public class TestRedis01 {
	public static void main(String[] args) {
		// 连接本地的 Redis 服务
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		// 查看服务是否运行，打出pong表示OK
		System.out.println("connection is OK==========>: " + jedis.ping());
	}
}
