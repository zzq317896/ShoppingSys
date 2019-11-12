package com.zzq.entity;
/**
 * 订单实体类
 * @author	张自权
 *@date2019年10月28日上午10:39:36
 *@version v1.0
 */
public class Order {
	private int id;//订单id
	private String orderId;//订单编号
	private String createTime;//下单时间
	private int userId;//用户id
	private double totalAcount;//总金额
	private double feightAcount;//运费
	private double payAmount;//实付金额
	private int payType;//支付类型
	private int status;//订单状态
	private int addressId;//地址id
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public double getTotalAcount() {
		return totalAcount;
	}
	public void setTotalAcount(double totalAcount) {
		this.totalAcount = totalAcount;
	}
	public double getFeightAcount() {
		return feightAcount;
	}
	public void setFeightAcount(double feightAcount) {
		this.feightAcount = feightAcount;
	}
	public double getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(double payAmount) {
		this.payAmount = payAmount;
	}
	public int getPayType() {
		return payType;
	}
	public void setPayType(int payType) {
		this.payType = payType;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
}
