package com.cts.vehicleservice.service;

import java.util.List;

import com.cts.vehicleservice.model.Bill;



public interface BillService {
	Bill addBill(Bill bill);
	
	Bill getBill(Integer userId);
	List<Bill>getAllbills();
	Bill saveBill(Bill bill);


}
