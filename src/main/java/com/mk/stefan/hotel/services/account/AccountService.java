package com.mk.stefan.hotel.services.account;

import com.mk.stefan.hotel.model.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAllAccounts();

    Account createNewAccount(String username);

}
