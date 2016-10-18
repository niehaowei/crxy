package com.atguigu.redis;

import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

public class TestRedis04 {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("127.0.0.1", 6379);

		jedis.watch("serialNum");
		jedis.set("serialNum", "s#####################");
		jedis.unwatch();

		Transaction transaction = jedis.multi();
		Response<String> response = transaction.get("serialNum");
		transaction.set("serialNum", "s002");
		response = transaction.get("serialNum");
		transaction.lpush("mlist", "a");
		transaction.lpush("mlist", "b");
		transaction.lpush("mlist", "c");
		List<Object> exec = transaction.exec();
		System.out.println("serialNum  " + response.get());

	}
}
