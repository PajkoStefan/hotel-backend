package com.mk.stefan.hotel.controllers;

import com.mk.stefan.hotel.repositories.AccountRepository;
import com.mk.stefan.hotel.repositories.LoginRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController  {

    private final LoginRepository loginRepository;

    public LoginController(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @RequestMapping("/login")
    public  String getUsername(Model model){

        model.addAttribute("logins", loginRepository.findAll());

        return "loginlist";
    }
}
