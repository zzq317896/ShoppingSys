package com.zzq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzq.dao.ProvinceDao;
import com.zzq.entity.Province;

@Service
public class ProvinceServiceImp implements ProvinceService {
	@Autowired
	ProvinceDao dao;
	@Override
	public List<Province> find() {
		return dao.find();
	}

	@Override
	public Province findByid(int id) {
		return dao.findById(id);
	}

}
