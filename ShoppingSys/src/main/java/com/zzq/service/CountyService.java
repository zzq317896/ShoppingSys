package com.zzq.service;

import java.util.List;

import com.zzq.entity.County;

public interface CountyService {

	public List<County> find();
	public County findById(int id);
}
