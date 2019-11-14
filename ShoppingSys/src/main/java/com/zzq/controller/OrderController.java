package com.zzq.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zzq.entity.Order;
import com.zzq.service.OrderService;

/**
 * 订单控制层
 * @author	张自权
 *@date2019年10月28日上午10:42:26
 *@version v1.0
 */
@Controller
public class OrderController {
	@Autowired
	OrderService oService;
	/**
	 * 跳转到商品详情页面
	 * @return
	 */
	@RequestMapping("proDetail")
	public String skip() {
		return "proDetail";
	}
	/**
	 * 跳转到下单页面
	 * @return
	 */
	@RequestMapping("order")
	public String buy(String num,Model model) {
		model.addAttribute("num",num);
		return "order";
	}
	/**
	 * 跳转到支付页面
	 * @return
	 */
	@RequestMapping("ok")
	public String pay(String num,Model model,Order order) {
		oService.addOrder(order);
		model.addAttribute("num",num);
		return "ok";
	}
	/**
	 * 跳转到个人中心我的订单栏
	 * @return
	 */
	@RequestMapping("myorderq")
	public String sucess(String num,Model model,String orderId) {
		List<Order> list=oService.getAll(orderId);
		model.addAttribute("num",num);
		model.addAttribute("list",list);
		return "myorderq";
	}
	/**
	 * 跳转到个人中心订单详情页面
	 * @return
	 */
	@RequestMapping("orderxq")
	public String detail() {
		return "orderxq";
	}
	@RequestMapping("update")
	public String update(String orderIds,Model model) {
		oService.update(orderIds);
		model.addAttribute("info", "已收货");
		return "forward:myorderq";
	}
}
