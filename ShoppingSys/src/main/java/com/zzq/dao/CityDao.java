package com.zzq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zzq.entity.City;

@Mapper
public interface CityDao {
	public List<City> find();
	public City findById(int id);
}
