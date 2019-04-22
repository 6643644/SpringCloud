package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/******************************************************************************************
 * @author Miles
 * 
 * 這是一個entity
 * 1. @Entity
 * 2. @Table 表示綁定哪個一個table名稱
 * 3. @Id PK
 * 4. @Column 對應欄位
 * 
 *******************************************************************************************/
@Entity
@Table(name = "user")
public class User {

	@Id
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
