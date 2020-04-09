package com.mk.stefan.hotel.repositories;

import com.mk.stefan.hotel.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
