package com.mk.stefan.hotel.repositories;

import com.mk.stefan.hotel.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
