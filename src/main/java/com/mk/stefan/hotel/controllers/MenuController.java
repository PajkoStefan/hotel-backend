package com.mk.stefan.hotel.controllers;

import com.mk.stefan.hotel.repositories.MenuRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {

    private final MenuRepository menuRepository;

    public MenuController(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @RequestMapping("/menu")
    public  String getMenus(Model model){

        model.addAttribute("menus", menuRepository.findAll());

        return "menulist";
    }

}
