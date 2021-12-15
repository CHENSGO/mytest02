package com.csg.tset;

import com.csg.utils.RedisUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Transaction;

public class Test01 {
    public static void main(String[] args) {
        JedisPool pool = RedisUtils.open("192.168.37.131", 6379 );
        Jedis jedis = pool.getResource();
        jedis.flushAll();
        String str2 = jedis.set("str2", "333");
        System.out.println(str2);
        /*Jedis jedis = new Jedis("192.168.37.131",6379);
        jedis.auth("123456");
        jedis.flushAll();
        jedis.set("str2","123");*/
        Transaction multi = jedis.multi();
    }
}
