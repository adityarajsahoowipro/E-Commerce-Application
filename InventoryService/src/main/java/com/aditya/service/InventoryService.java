package com.aditya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditya.repository.InventoryRepository;

@Service
public class InventoryService {
	
	@Autowired
    private InventoryRepository inventoryRepository;

    public boolean isProductAvailable(String product, int quantity) {
        return inventoryRepository.findByProduct(product)
                .map(inventory -> inventory.getStock() >= quantity)
                .orElse(false);
    }

}
