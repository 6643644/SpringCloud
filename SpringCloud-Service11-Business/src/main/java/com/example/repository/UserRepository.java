package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.User;

/**
 * @author Miles
 * 
 *         建立Repository 並且使用Spring Data JPA
 * 
 *         1. @Repository: 註冊JPA ; 2. 實作JpaRepository 接口 key一個
 *         Repository對應一個entity，另一個參數為該entity的pk
 * 
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findById(Integer id);
}
