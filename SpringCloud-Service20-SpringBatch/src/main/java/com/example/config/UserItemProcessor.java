package com.example.config;

import org.springframework.batch.item.ItemProcessor;

import com.example.model.PUser;
import com.example.model.User;

/**
 * 處理資料器 ItemProcessor<User, PUser> User為傳入資料，PUser為處理後返回資料
 */
public class UserItemProcessor implements ItemProcessor<User, PUser> {

	@Override
	public PUser process(User item) throws Exception {
		System.out.println("User item id:"+item.getId()+";name:"+item.getName());
		
		PUser pUser = new PUser();
		pUser.setId(item.getId());
		pUser.setName(item.getName());
		pUser.setAddress(item.getAddress());
		pUser.setRemark("DEMO~");
		return pUser;
	}

}
