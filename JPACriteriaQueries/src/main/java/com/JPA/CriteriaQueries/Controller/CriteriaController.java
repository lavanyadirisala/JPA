package com.JPA.CriteriaQueries.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JPA.CriteriaQueries.service.CriteriaService;

@RestController
@RequestMapping("/query")
public class CriteriaController {
	@Autowired
	CriteriaService criteriaservice;
	
	@GetMapping("/get")
	public void getStudent() {
		criteriaservice.selectquery();
	}
	@GetMapping("/order")
	public void orderStudent() {
		criteriaservice.orderquery();
	}
	@GetMapping("/where")
	public void whereStudent() {
		criteriaservice.wherequery();
	}
}
