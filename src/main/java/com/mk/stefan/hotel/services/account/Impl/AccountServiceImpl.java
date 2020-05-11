package com.mk.stefan.hotel.services.account.Impl;

import com.mk.stefan.hotel.model.Account;
import com.mk.stefan.hotel.model.SignUp;
import com.mk.stefan.hotel.repositories.AccountRepository;
import com.mk.stefan.hotel.services.account.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;


    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getAllAccounts() {
        System.out.println(accountRepository.findAll());
        return accountRepository.findAll();
    }

    @Override
    public Account createNewAccount(String username, SignUp signUp) {
        Account account = new Account(username);
        account.setSignUp(signUp);
        return this.accountRepository.save(account);
    }


}
