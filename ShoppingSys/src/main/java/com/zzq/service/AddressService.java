package com.zzq.service;

import java.util.List;

import com.zzq.entity.Address;

public interface AddressService {
	public List<Address> find();
	public Address findById(int id);
	public int add(Address address);
}
