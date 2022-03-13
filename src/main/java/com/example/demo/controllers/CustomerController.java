package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@PostMapping(path = "/save")
    public String Save(@RequestBody Customer cust) {


        return "Customer information saved successfully ::." + cust.getCustNo() + " " + cust.getName() + " " + cust.getCountry();
    }

}
