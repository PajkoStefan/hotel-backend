package com.mk.stefan.hotel.controllers;

import com.mk.stefan.hotel.repositories.PaymentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaymentController {

    private final PaymentRepository paymentRepository;

    public PaymentController(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @RequestMapping("/payment")
    public  String getPayments(Model model){

        model.addAttribute("payments", paymentRepository.findAll());

        return "paymentlist";
    }
}
