package com.mk.stefan.hotel.controllers;

import com.mk.stefan.hotel.repositories.ContactUsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactUsController {

    private final ContactUsRepository contactUsRepository;

    public ContactUsController(ContactUsRepository contactUsRepository) {
        this.contactUsRepository = contactUsRepository;
    }

    @RequestMapping("/contactus")
    public  String getContactUsInfo(Model model){

        model.addAttribute("contactusinfos", contactUsRepository.findAll());

        return "contactusinfolist";
    }

}
