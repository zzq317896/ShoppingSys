package com.zzq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzq.dao.CityDao;
import com.zzq.entity.City;

@Service
public class CityServiceImp implements CityService{
	@Autowired
	CityDao dao;
	@Override
	public List<City> find() {
		return dao.find();
	}

	@Override
	public City findById(int id) {
		return dao.findById(id);
	}

}
