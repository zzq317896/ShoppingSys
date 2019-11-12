package com.zzq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zzq.entity.Province;

@Mapper
public interface ProvinceDao {
	public List<Province> find();
	public Province findById(int id);
}
