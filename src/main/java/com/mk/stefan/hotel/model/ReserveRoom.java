package com.mk.stefan.hotel.model;

import com.mk.stefan.hotel.model.embeddedIds.AccountRoomRoomReservationId;
import lombok.AllArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "reserve_room")
@AllArgsConstructor
public class ReserveRoom {

    @EmbeddedId
    private AccountRoomRoomReservationId id;

    public ReserveRoom() {
    }
}

