package com.aditya.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditya.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
	Optional<Inventory> findByProduct(String product);

}
