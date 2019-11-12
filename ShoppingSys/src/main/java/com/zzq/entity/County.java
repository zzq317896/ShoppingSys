package com.zzq.entity;
/**
 * 区/县实体类
 * @author 李金艳
 * 2019年11月11日 上午11:43:41
 */
public class County {
	private int id;
	private String name;
	private City city;
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
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
}
