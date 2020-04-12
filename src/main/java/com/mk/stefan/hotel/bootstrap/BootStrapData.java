package com.mk.stefan.hotel.bootstrap;

import com.mk.stefan.hotel.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AccountRepository accountRepository;
    private final SignUpRepository signUpRepository;
    private final LoginRepository loginRepository;
    private final RoomRepository roomRepository;
    private final TableRepository tableRepository;
    private final RoomReservationRepository roomReservationRepository;
    private final TableReservationRepository tableReservationRepository;
    private final OrderRepository orderRepository;
    private final ServiceRepository serviceRepository;
    private final MenuRepository menuRepository;
    private final BillRepository billRepository;
    private final PaymentRepository paymentRepository;
    private final ContactUsRepository contactUsRepository;
    private final OfferRepository offerRepository;

    public BootStrapData(AccountRepository accountRepository, SignUpRepository signUpRepository,
                         LoginRepository loginRepository, RoomRepository roomRepository,
                         TableRepository tableRepository,
                         RoomReservationRepository roomReservationRepository,
                         TableReservationRepository tableReservationRepository,
                         OrderRepository orderRepository, ServiceRepository serviceRepository,
                         MenuRepository menuRepository, BillRepository billRepository,
                         PaymentRepository paymentRepository, ContactUsRepository contactUsRepository,
                         OfferRepository offerRepository) {

        this.accountRepository = accountRepository;
        this.signUpRepository = signUpRepository;
        this.loginRepository = loginRepository;
        this.roomRepository = roomRepository;
        this.tableRepository = tableRepository;
        this.roomReservationRepository = roomReservationRepository;
        this.tableReservationRepository = tableReservationRepository;
        this.orderRepository = orderRepository;
        this.serviceRepository = serviceRepository;
        this.menuRepository = menuRepository;
        this.billRepository = billRepository;
        this.paymentRepository = paymentRepository;
        this.contactUsRepository = contactUsRepository;
        this.offerRepository = offerRepository;
    }

    @Override
    public void run(String... args) throws Exception {


    }

}
