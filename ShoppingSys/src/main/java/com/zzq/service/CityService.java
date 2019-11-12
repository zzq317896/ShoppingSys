package com.zzq.service;

import java.util.List;

import com.zzq.entity.City;

public interface CityService {

	public List<City> find();
	public City findById(int id);
}
