package com.test.wookyeong.address.VO;

import org.springframework.stereotype.Component;

@Component("addressVO")
public class AddressVO {
	private int id;
	private String name;
	private int age;
	private String phone;
	private String address;
	public AddressVO() {
		
	}
	
	public AddressVO(String name,int age,String phone,String address) {
		this.name = name;
		this.age = age;
		this.phone =phone;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
