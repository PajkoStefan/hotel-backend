package com.mk.stefan.hotel.repositories;

import com.mk.stefan.hotel.model.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
