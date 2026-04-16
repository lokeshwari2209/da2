package com.example.order.controller;

import org.springframework.web.bind.annotation.*;
import com.example.order.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService service = new OrderService();

    // Place Order
    @PostMapping("/place")
    public String placeOrder(@RequestParam int id, @RequestParam String item) {
        return service.placeOrder(id, item);
    }

    // Track Order
    @GetMapping("/track")
    public String trackOrder(@RequestParam int id) {
        return service.trackOrder(id);
    }
}