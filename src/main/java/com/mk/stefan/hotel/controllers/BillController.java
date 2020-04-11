package com.mk.stefan.hotel.controllers;

import com.mk.stefan.hotel.repositories.BillRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BillController {

    private final BillRepository billRepository;

    public BillController(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    @RequestMapping("/bill")
    public  String getRooms(Model model){

        model.addAttribute("bills", billRepository.findAll());

        return "billlist";
    }
}
