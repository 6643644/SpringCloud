package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.example.resources.dto.UserResponse;

@Configuration
public class RedisConfig {

	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		return new JedisConnectionFactory();
	}

//	@Bean
//	public RedisConnectionFactory redisConnectionFactory() {
//		return new JedisConnectionFactory();
//	}

	@Bean
	public RedisTemplate<String, UserResponse> redisTemplate(RedisConnectionFactory factory) {
		RedisTemplate<String, UserResponse> template = new RedisTemplate<String, UserResponse>();
		template.setConnectionFactory(jedisConnectionFactory());
		template.setKeySerializer(new StringRedisSerializer());
		template.setValueSerializer(new RedisObjectSerializer());
		return template;
	}
}
