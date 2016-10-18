package com.atguigu.redis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;


public class TestRedis03 {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("127.0.0.1", 6379);
		/*
		Set<String> set = jedis.keys("*");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("jedis.exits()=====>" +jedis.exists("k4"));
		System.out.println("jedis.ttl()=====>"+jedis.ttl("k4"));
		System.out.println("jedis.get()=====>"+jedis.get("k4"));
		jedis.append("k4", "ILOVEYOU");
		System.out.println(jedis.get("k4"));
		jedis.set("k123", "nihaoshijiewodemingzijiaowangyining");
		System.out.println(jedis.get("k123"));
		jedis.mset("name","wyn","age","18","email","123123@qq.com");
		System.out.println(jedis.mget("name","age","email"));
		
		jedis.lpush("mlist", "str1","str2","str3","str4");
		System.out.println(jedis.llen("mlist"));
		List<String> list = jedis.lrange("mlist", 0, -1);
		for (String info : list) {
			System.out.println("===========>"+info);
		}
		
		Student student = new Student(20, "zhangsan");
		jedis.set("age", student.getAge()+"");
		jedis.set("name", student.getName());
		String age = jedis.get("age");
		String name = jedis.get("name");
		System.out.println(age+"======>"+name);
		
			
		jedis.sadd("orders","jd001");
   jedis.sadd("orders","jd002");
   jedis.sadd("orders","jd003");
   Set<String> set = jedis.smembers("orders");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		jedis.srem("orders", "jd002");
		System.out.println("====================");
		set = jedis.smembers("orders");
		iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("telphone","13811814763");
		map.put("address","atguigu");
		map.put("email","abc@163.com");
		jedis.hmset("hashMap", map);
		List<String> list = jedis.hmget("hashMap", "email","address","telphone");
		for (String info : list) {
			System.out.println(info);
		}
		
		*/
		
		jedis.zadd("zset01",60d,"v1");
	 jedis.zadd("zset01",70d,"v2");
	 jedis.zadd("zset01",80d,"v3");
	 jedis.zadd("zset01",90d,"v4");
		
	 Set<String> set = jedis.zrange("zset01", 0, -1);
	 Iterator<String> iterator = set.iterator();
	 while(iterator.hasNext()){
		 System.out.println(iterator.next());
	 }
	}
}
