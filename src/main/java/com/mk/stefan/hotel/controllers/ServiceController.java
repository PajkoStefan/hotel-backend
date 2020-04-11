package com.mk.stefan.hotel.controllers;

import com.mk.stefan.hotel.repositories.ServiceRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServiceController {

    private final ServiceRepository serviceRepository;

    public ServiceController(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    @RequestMapping("/service")
    public  String getServices(Model model){

        model.addAttribute("services", serviceRepository.findAll());

        return "servicelist";
    }

}
