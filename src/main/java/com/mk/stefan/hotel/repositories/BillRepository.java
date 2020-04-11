package com.mk.stefan.hotel.repositories;

import com.mk.stefan.hotel.model.Bill;
import org.springframework.data.repository.CrudRepository;

public interface BillRepository extends CrudRepository<Bill, Long> {
}
