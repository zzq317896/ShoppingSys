package com.zzq.service;

import java.util.List;

import com.zzq.entity.Province;

/**
 * 业务层接口
 * @author 李金艳
 * 2019年11月12日 下午7:00:12
 */
public interface ProvinceService {
	public List<Province> find();
	public Province findById(int id);
}
