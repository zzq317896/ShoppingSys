package com.zzq.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
/**
 * 地址持久化接口
 * @author 李金艳
 * 2019年11月12日 上午8:22:27
 */

import com.zzq.entity.Address;
@Mapper
public interface AddressDao {
	public List<Address> find();
	public Address findById();
	public int add(Address address);
	public int delete(int id);
	public int update(Map map);
}
