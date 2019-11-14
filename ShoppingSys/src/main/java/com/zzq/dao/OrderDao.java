package com.zzq.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.zzq.entity.Order;

/**
 * 订单持久化接口
 * @author	张自权
 *@date2019年10月28日上午10:41:44
 *@version v1.0
 */
@Mapper
public interface OrderDao {
	/**
	 * 添加订单
	 * @param order 订单对象
	 * @return
	 */
	int addOrder(Order order);
	
	List<Order> getAll(Map map);
	
	int update(String orderIds);
	
}
