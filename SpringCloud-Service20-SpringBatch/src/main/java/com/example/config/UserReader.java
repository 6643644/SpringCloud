package com.example.config;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.example.model.User;

public class UserReader implements ItemReader<User> {

	@Override
	public User read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		
		return null;
	}

}
