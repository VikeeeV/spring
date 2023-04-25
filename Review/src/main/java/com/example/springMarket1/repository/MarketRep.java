package com.example.springMarket1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springMarket1.model.Market;
@Repository

public interface MarketRep extends JpaRepository<Market,Integer>{

}
