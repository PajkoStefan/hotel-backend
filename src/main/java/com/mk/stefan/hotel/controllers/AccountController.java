package com.mk.stefan.hotel.controllers;

import com.mk.stefan.hotel.model.Account;
import com.mk.stefan.hotel.services.account.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class AccountController {

    private final AccountService accountService;
    public AccountController( AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/getallaccounts")
    public List<Account> getAllAccounts() {
        return  accountService.getAllAccounts();
    }

    @PostMapping("/createaccount")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Account createNewAccount(@RequestBody Account account,
                                    HttpServletResponse response,
                                    UriComponentsBuilder builder){

        Account account1 = new Account(account.getUsername());

        response.setHeader("Location", builder.path("/api/createaccount/"+account.getId()).
                buildAndExpand(account.getId()).toUriString());
        //

        return accountService.createNewAccount(account1.getUsername(), account.getSignUp());

    }
}

