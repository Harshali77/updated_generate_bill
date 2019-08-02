package com.cts.vehicleservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.vehicleservice.model.Bill;


import com.cts.vehicleservice.service.*;

	
	
	@RestController
	@RequestMapping("/GenerateBill")
	@CrossOrigin
	public class BillController {


		@Autowired
		private BillService BillService;

		@GetMapping("/showAllbills")
		@CrossOrigin(origins = "http://localhost:4200")
		public ResponseEntity<List<Bill>> getAll() {

			System.out.println("In get all controller...");
			return new ResponseEntity<List<Bill>>(BillService.getAllbills(), HttpStatus.OK);
		}

		/*
		 * @GetMapping("/") public ModelAndView getHome() {
		 * 
		 * return new ModelAndView("home", "home","home"); }
		 */

		@GetMapping("/{userId}")
		public ResponseEntity<Bill> getBill(@PathVariable Integer userId) {
			ResponseEntity<Bill> response = null;

			Bill bill = BillService.getBill(userId);

			if (bill != null) {
				response = new ResponseEntity<Bill>(bill, HttpStatus.OK);
			} else {
				response = new ResponseEntity<Bill>(bill, HttpStatus.NOT_FOUND);
			}
			return response;
		}

		@PostMapping("/addBill")
		public ResponseEntity<Bill> addBill(@RequestBody Bill bill) {

			//System.out.println("Inside add part...."+bill.getPartName());
			System.out.println("values of "+bill);

			ResponseEntity<Bill> response = null;
			Bill billUser = BillService.saveBill(bill);
			if (billUser == null) {
				response = new ResponseEntity<Bill>(HttpStatus.OK);

			} else {
				response = new ResponseEntity<Bill>(billUser, HttpStatus.OK);
			}
			return response;
		}
		
}
