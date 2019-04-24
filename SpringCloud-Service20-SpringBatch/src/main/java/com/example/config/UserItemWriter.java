package com.example.config;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.model.PUser;

public class UserItemWriter implements ItemWriter<PUser>, InitializingBean {

	private JdbcTemplate jdbcTemplate;

	public UserItemWriter(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void write(List<? extends PUser> items) throws Exception {

		items.forEach(item -> {
			System.out.println("item id:"+item.getId()+",name:"+item.getName());
			// upup~
			System.out.println("我在寫入了~~~");
		});

	}

}
