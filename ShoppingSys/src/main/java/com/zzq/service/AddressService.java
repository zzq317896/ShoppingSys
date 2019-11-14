package com.zzq.service;

import java.util.List;
import java.util.Map;

import com.zzq.entity.Address;

public interface AddressService {
	public List<Address> find();
	public Address findById(int id);
	public int add(Address address);
	public int delete(int id);
	public int update(Address  address);
}
