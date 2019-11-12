package com.zzq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzq.dao.ProvinceDao;
import com.zzq.entity.Province;

@Service
public class ProvinceServiceImp implements ProvinceService{
	@Autowired
	ProvinceDao dao;
	@Override
	public List<Province> find() {
		// TODO Auto-generated method stub
		return dao.find();
	}

	@Override
	public Province findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

}
