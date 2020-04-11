package com.mk.stefan.hotel.controllers;

import com.mk.stefan.hotel.repositories.TableRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TableController {

    private final TableRepository tableRepository;

    public TableController(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    @RequestMapping("/table")
    public  String getAccounts(Model model){

        model.addAttribute("tables", tableRepository.findAll());

        return "tablelist";
    }
}
