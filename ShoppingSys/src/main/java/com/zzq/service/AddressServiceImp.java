package com.zzq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzq.dao.AddressDao;
import com.zzq.entity.Address;

@Service
public class AddressServiceImp implements AddressService{
	@Autowired
	AddressDao  dao;
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
	public int add(Address address) {
		// TODO Auto-generated method stub
		return dao.add(address);
	}

}
