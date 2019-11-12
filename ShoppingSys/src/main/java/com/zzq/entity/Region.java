package com.zzq.entity;
/**
 * 配送区域实体类
 * @author 李金艳
 * 2019年11月11日 上午11:41:51
 */
public class Region {
	private int id;
	private String name;
	private County county;
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
	public County getCounty() {
		return county;
	}
	public void setCounty(County county) {
		this.county = county;
	}
	
}
