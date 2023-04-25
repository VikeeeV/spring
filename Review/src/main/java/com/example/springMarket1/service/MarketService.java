package com.example.springMarket1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springMarket1.model.Market;
import com.example.springMarket1.repository.MarketRep;
@Service

public class MarketService {
	@Autowired
	private MarketRep studentrep;
	public Market Post(Market student)
	{
		return studentrep.save(student);
	}
	public List<Market> getAll()
	{
		return studentrep.findAll();	
	}
	public Market Update(Market student)
	{
		return studentrep.save(student);
	}
	public void Delete(int rollno)
	{
		studentrep.deleteById(rollno);
	}
}
