package com.mk.stefan.hotel.controllers;

import com.mk.stefan.hotel.repositories.RoomRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoomController {

    private final RoomRepository roomRepository;

    public RoomController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @RequestMapping("/room")
    public  String getRooms(Model model){

        model.addAttribute("rooms", roomRepository.findAll());

        return "roomlist";
    }
}
