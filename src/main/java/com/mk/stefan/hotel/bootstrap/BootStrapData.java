package com.mk.stefan.hotel.bootstrap;

import com.mk.stefan.hotel.model.Account;
import com.mk.stefan.hotel.model.Login;
import com.mk.stefan.hotel.model.SignUp;
import com.mk.stefan.hotel.model.Room;
import com.mk.stefan.hotel.model.Table;
import com.mk.stefan.hotel.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AccountRepository accountRepository;
    private final SignUpRepository signUpRepository;
    private final LoginRepository loginRepository;
    private final RoomRepository roomRepository;
    private final TableRepository tableRepository;

    public BootStrapData(AccountRepository accountRepository,
                         SignUpRepository signUpRepository,
                         LoginRepository loginRepository,
                         RoomRepository roomRepository,
                         TableRepository tableRepository) {
        this.accountRepository = accountRepository;
        this.signUpRepository = signUpRepository;
        this.loginRepository = loginRepository;
        this.roomRepository = roomRepository;
        this.tableRepository = tableRepository;
    }

    @Override
    public void run(String... args) throws Exception {


    }

}
