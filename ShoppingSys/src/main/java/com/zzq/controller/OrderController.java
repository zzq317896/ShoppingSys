package com.zzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 订单控制层
 * @author	张自权
 *@date2019年10月28日上午10:42:26
 *@version v1.0
 */
@Controller
public class OrderController {
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
	public String pay() {
		return "ok";
	}
	/**
	 * 跳转到个人中心我的订单栏
	 * @return
	 */
	@RequestMapping("myorderq")
	public String sucess() {
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
}
