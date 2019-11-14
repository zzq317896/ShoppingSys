package com.zzq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzq.dao.CountyDao;
import com.zzq.entity.County;

@Service
public class CountyServiceImp implements CountyService{
	@Autowired
	CountyDao dao;
	@Override
	public List<County> find() {
		// TODO Auto-generated method stub
		return dao.find();
	}

	@Override
	public County findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

}
