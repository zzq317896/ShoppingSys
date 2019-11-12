package com.zzq.entity;
/**
 * 地址实体类
 * @author 李金艳
 * 2019年11月11日 上午11:38:12
 */
public class Address {
	private int id;
	private String name; 
	private String phone; 
	private Province province;
	private City city; 
	private County county;
	private Region region;
	private String detailSite;
	private int postcode;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Province getProvince() {
		return province;
	}
	public void setProvince(Province province) {
		this.province = province;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public County getCounty() {
		return county;
	}
	public void setCounty(County county) {
		this.county = county;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public String getDetailSite() {
		return detailSite;
	}
	public void setDetailSite(String detailSite) {
		this.detailSite = detailSite;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	
}
