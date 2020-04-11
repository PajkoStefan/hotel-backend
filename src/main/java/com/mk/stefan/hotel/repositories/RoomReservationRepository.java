package com.mk.stefan.hotel.repositories;

import com.mk.stefan.hotel.model.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomReservationRepository extends CrudRepository<Room, Long> {
}
