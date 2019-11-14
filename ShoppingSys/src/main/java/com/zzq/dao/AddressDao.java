package com.zzq.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.zzq.entity.Address;

/**
 * 持久层
 * @author 李金艳
 * 2019年11月13日 下午8:03:33
 */
@Mapper
public interface AddressDao {
	public List<Address> find();
	public Address findById(int id);
	public int add(Address Address);
	public int delete(int id);
	public int update(Address  address);
}
