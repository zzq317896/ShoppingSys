package com.zzq.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzq.dao.OrderDao;
import com.zzq.entity.Order;
import com.zzq.util.PageUtil;

/**
 * 订单业务层
 * @author	张自权
 *@date2019年10月28日上午10:41:18
 *@version v1.0
 */
@Service
public class OrderService {
	@Autowired
	OrderDao dao;
	
	public int addOrder(Order order) {
		return dao.addOrder(order);
	}
	
	public List<Order> getAll(String orderId){
		Map<String, Object> map=new HashMap<String, Object>();
		if (orderId!=null) {
			map.put("orderId",orderId);
		}
		List<Order> list=dao.getAll(map);//当前页数据
		return list;
	}
	
	public int update(String orderIds) {
		return dao.update(orderIds);
	}
}
