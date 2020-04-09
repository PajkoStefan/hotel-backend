package com.mk.stefan.hotel.bootstrap;

import com.mk.stefan.hotel.model.Account;
import com.mk.stefan.hotel.model.Login;
import com.mk.stefan.hotel.model.SignUp;
import com.mk.stefan.hotel.repositories.AccountRepository;
import com.mk.stefan.hotel.repositories.LoginRepository;
import com.mk.stefan.hotel.repositories.SignUpRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner{


    private final AccountRepository accountRepository;
    private final  SignUpRepository signUpRepository;
    private final  LoginRepository loginRepository;

    public BootStrapData(AccountRepository accountRepository,
                         SignUpRepository signUpRepository,
                         LoginRepository loginRepository) {
        this.accountRepository = accountRepository;
        this.signUpRepository = signUpRepository;
        this.loginRepository = loginRepository;
    }

    @Override
    public void run(String... args) throws Exception {


    }

}
