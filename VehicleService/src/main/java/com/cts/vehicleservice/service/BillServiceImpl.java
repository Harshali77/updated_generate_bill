package com.cts.vehicleservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.vehicleservice.dao.BillRepository;
import com.cts.vehicleservice.model.Bill;

@Service
public class BillServiceImpl implements BillService {
	@Autowired
	private BillRepository billRepo;

	@Override
	public Bill addBill(Bill bill) {
		System.out.println("Inside crud repo...");

		if (bill != null) {
			System.out.println("New bill...");

			try {
				bill = billRepo.save(bill);
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		return bill;
	}


	  @Override public Bill getBill(Integer userId) {
	  
	  System.out.println("*******IN SERVICE IMPL**********");
	 
	  Bill bill=null; if (billRepo.existsById(userId)) {
	  //bill=billRepo.findById(userId);
	  
	  }
	 
	  return bill; }
	 

	@Override
	public List<Bill> getAllbills() {

		return billRepo.findAll();
	}

	@Override
	public Bill saveBill(Bill bill) {

		System.out.println("Inside crud repo...");
		if (bill != null) {
			System.out.println("New Part...");

			try {
				bill = billRepo.save(bill);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return bill;
	}

}
