package com.mk.stefan.hotel.model;


import com.mk.stefan.hotel.model.embeddedIds.AccountTableTableReservationId;
import lombok.AllArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "reserve_Table")
@AllArgsConstructor
public class ReserveTable {

    @EmbeddedId
    private AccountTableTableReservationId id;

    public ReserveTable() {
    }
}
