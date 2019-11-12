package com.zzq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zzq.entity.County;

@Mapper
public interface CountyDao {

	public List<County> find();
	public County findById(int id);
}
