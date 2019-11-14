package com.zzq.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzq.dao.AddressDao;
import com.zzq.entity.Address;

@Service
public class AddressServiceImp implements AddressService{
	@Autowired
	AddressDao dao;

	@Override
	public List<Address> find() {
		// TODO Auto-generated method stub
		return dao.find();
	}

	@Override
	public Address findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public int update(Address  address) {
		// TODO Auto-generated method stub
		return dao.update(address);
	}

	@Override
	public int add(Address address) {
		// TODO Auto-generated method stub
		return dao.add(address);
	}

}
