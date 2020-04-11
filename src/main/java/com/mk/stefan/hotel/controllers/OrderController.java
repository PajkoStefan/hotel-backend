package com.mk.stefan.hotel.controllers;

import com.mk.stefan.hotel.repositories.OrderRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @RequestMapping("/order")
    public  String getOrders(Model model){

        model.addAttribute("orders", orderRepository.findAll());

        return "orderlist";
    }
}
