package com.zzq.entity;
/**
 * 城市实体类
 * @author 李金艳
 * 2019年11月11日 上午11:42:04
 */
public class City {
	private int id;
	private String  name;
	private Province province;
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
	public Province getProvince() {
		return province;
	}
	public void setProvince(Province province) {
		this.province = province;
	}
	
}
