package com.mk.stefan.hotel.controllers;

import com.mk.stefan.hotel.repositories.OfferRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OfferController {

    private final OfferRepository offerRepository;

    public OfferController(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @RequestMapping("/offer")
    public  String getMenus(Model model){

        model.addAttribute("offers", offerRepository.findAll());

        return "offerlist";
    }


}
