package com.mk.stefan.hotel.repositories;

import com.mk.stefan.hotel.model.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<Login, Long> {
}
