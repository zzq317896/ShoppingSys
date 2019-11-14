package com.zzq.service;

import java.util.List;

import com.zzq.entity.Province;

public interface ProvinceService {
	public List<Province> find();
	public Province findByid(int id);
}
