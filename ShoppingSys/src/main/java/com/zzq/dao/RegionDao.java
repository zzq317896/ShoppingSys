package com.zzq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zzq.entity.Region;

@Mapper
public interface RegionDao {
	public List<Region> find();
	public Region findByid(int id);
}
