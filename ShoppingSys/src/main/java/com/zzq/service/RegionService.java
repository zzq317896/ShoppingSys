package com.zzq.service;

import java.util.List;

import com.zzq.entity.Region;

public interface RegionService {

	public List<Region> find();
	public Region findByid(int id);
}
