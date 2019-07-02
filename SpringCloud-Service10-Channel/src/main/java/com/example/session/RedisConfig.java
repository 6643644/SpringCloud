package com.example.session;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
//	@Bean
//	public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
//		StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
//
//		RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
//		template.setConnectionFactory(redisConnectionFactory);
//		template.setKeySerializer(stringRedisSerializer);
//		template.setValueSerializer(redisObjectSerializer);
//		return template;
//	}

}
