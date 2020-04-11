package com.mk.stefan.hotel.controllers;

import com.mk.stefan.hotel.repositories.AccountRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping("/account")
    public  String getAccounts(Model model){

        model.addAttribute("accounts", accountRepository.findAll());

        return "accountlist";
    }
}

