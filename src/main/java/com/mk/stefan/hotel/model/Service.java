package com.mk.stefan.hotel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "additional_request")
    private String additionalRequest;

    private String price;

    public Service() {
    }

    public Service(String serviceName, String additionalRequest, String price) {
        this.serviceName = serviceName;
        this.additionalRequest = additionalRequest;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceName='" + serviceName + '\'' +
                ", additionalRequest='" + additionalRequest + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Service service = (Service) o;

        return id != null ? id.equals(service.id) : service.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}
