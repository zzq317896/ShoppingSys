package com.zzq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzq.dao.RegionDao;
import com.zzq.entity.Region;

@Service
public class RegionServiceImp implements RegionService{
	@Autowired
	RegionDao dao;
	
	@Override
	public List<Region> find() {
		// TODO Auto-generated method stub
		return dao.find();
	}

	@Override
	public Region findByid(int id) {
		// TODO Auto-generated method stub
		return dao.findByid(id);
	}

}
