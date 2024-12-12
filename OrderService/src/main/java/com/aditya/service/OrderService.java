package com.aditya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditya.model.Order;
import com.aditya.repository.InventoryClient;
import com.aditya.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private InventoryClient inventoryClient;

    public Order placeOrder(Order order) {
        boolean isAvailable = inventoryClient.checkInventory(order.getProduct(), order.getQuantity());
        if (isAvailable) {
            return orderRepository.save(order);
        } else {
            throw new RuntimeException("Product not available");
        }
    }
}
