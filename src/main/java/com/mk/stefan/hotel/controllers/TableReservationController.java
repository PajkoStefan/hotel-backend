package com.mk.stefan.hotel.controllers;

import com.mk.stefan.hotel.repositories.TableReservationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TableReservationController {

    private final TableReservationRepository tableReservationRepository;

    public TableReservationController(TableReservationRepository tableReservationRepository) {
        this.tableReservationRepository = tableReservationRepository;
    }

    @RequestMapping("/tablereservation")
    public  String GetTableReservation(Model model){

        model.addAttribute("tablereservation", tableReservationRepository.findAll());

        return "tablereservationlist";
    }
}
