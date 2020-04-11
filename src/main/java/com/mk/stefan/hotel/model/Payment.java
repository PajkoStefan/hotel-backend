package com.mk.stefan.hotel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "security_code")
    private String securityCode;

    @Column(name = "expiration_date_month")
    private String expirationDateMonth;

    @Column(name = "expiration_date_year")
    private String expirationDateYear;


    public Payment() {
    }
}
