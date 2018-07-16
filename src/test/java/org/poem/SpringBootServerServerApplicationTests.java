package org.poem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootServerServerApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;


	@Test
	public void contextLoads() {
	}


	@Test
	public void test(){
		redisTemplate.opsForValue().set("name","123456");
		System.err.println(redisTemplate.opsForValue().get("name"));
	}
}
