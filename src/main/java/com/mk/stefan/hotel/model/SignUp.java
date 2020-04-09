package com.mk.stefan.hotel.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="signup")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SignUp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastName;

    private String username;

    private String password;

    private String email;

    private String gender;

    private String Birthday;

    @Column(name="signupdate")
    private String signUpDate;

    public SignUp(String firstName, String lastName, String username,
                  String password, String email, String gender,
                  String birthday, String signUpDate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        Birthday = birthday;
        this.signUpDate = signUpDate;
    }

    @Override
    public String toString() {
        return "SignUp{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", Birthday='" + Birthday + '\'' +
                ", signUpDate='" + signUpDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SignUp signUp = (SignUp) o;

        return id != null ? id.equals(signUp.id) : signUp.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}
