package com.mk.stefan.hotel.controllers;

import com.mk.stefan.hotel.repositories.RoomReservationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoomReservationController {

    private final RoomReservationRepository roomReservationRepository;

    public RoomReservationController(RoomReservationRepository roomReservationRepository) {
        this.roomReservationRepository = roomReservationRepository;
    }

    @RequestMapping("/roomreservation")
    public  String getRoomReservation(Model model){

        model.addAttribute("roomreservation", roomReservationRepository.findAll());

        return "roomreservationlist";
    }
}
