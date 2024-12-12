package com.aditya.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "inventory-service", url = "http://localhost:8081")
public interface InventoryClient {
    @GetMapping("/inventory/check")
    boolean checkInventory(@RequestParam String product, @RequestParam int quantity);
}
