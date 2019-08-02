package com.cts.vehicleservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bill")
public class Bill {
	
	@Id
	//@Column(name="billId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer billId;
	private Integer serviceCharge;
	private Integer oiling;
	private Integer spareCharge;
	private Integer userId;
	private Integer total;
	private String userName;
	
	
	public Integer getBillId() {
		return billId;
	}


	public void setBillId(Integer billId) {
		this.billId = billId;
	}


	public Integer getServiceCharge() {
		return serviceCharge;
	}


	public void setServiceCharge(Integer serviceCharge) {
		this.serviceCharge = serviceCharge;
	}


	

	public Integer getOiling() {
		return oiling;
	}


	public void setOiling(Integer oiling) {
		this.oiling = oiling;
	}


	public Integer getSpareCharge() {
		return spareCharge;
	}


	public void setSpareCharge(Integer spareCharge) {
		this.spareCharge = spareCharge;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public Integer getTotal() {
		return total;
	}


	public void setTotal(Integer total) {
		this.total = total;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", serviceCharge=" + serviceCharge + ", Oiling=" + oiling + ", spareCharge="
				+ spareCharge + ", userId=" + userId + ", total=" + total + ", userName=" + userName + "]";
	}


	
	
	
	
	

}
