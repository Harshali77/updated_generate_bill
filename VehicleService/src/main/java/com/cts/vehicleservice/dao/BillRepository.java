package com.cts.vehicleservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.vehicleservice.model.Bill;




	public interface BillRepository extends JpaRepository<Bill, Integer> {
		//List<Bill> findAllById(Integer userId);
	

	/*
	 * public boolean existsById(Integer userId);
	 * 
	 * public Bill findById(Integer userId);
	 * 
	 * public List<Bill> findAll();
	 * 
	 * public Bill save(Bill bill);
	 */
}
