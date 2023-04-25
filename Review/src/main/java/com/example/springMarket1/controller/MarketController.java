package com.example.springMarket1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springMarket1.model.Market;
import com.example.springMarket1.service.MarketService;
@RestController
@RequestMapping("/stu")
public class MarketController {
	@Autowired
	private MarketService studentservice;
	@PostMapping("/add")
	public String add(@RequestBody Market student)
	{
		studentservice.Post(student);
		return "Successfully Added";
	}
	@PutMapping("/update")
	public String update(@RequestBody Market student)
	{
		studentservice.Update(student);
		return "Successfully Updated";
	}
	@GetMapping("/get")
	public List<Market> getAll()
	{
		return studentservice.getAll();
	}
	@DeleteMapping("/delete/{rollno}")
	public void Delete(@PathVariable int rollno)
	{
		studentservice.Delete(rollno);
	}

}
