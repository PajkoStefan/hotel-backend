package com.mk.stefan.hotel.repositories;

import com.mk.stefan.hotel.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
