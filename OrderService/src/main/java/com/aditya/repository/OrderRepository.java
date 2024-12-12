package com.aditya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditya.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
