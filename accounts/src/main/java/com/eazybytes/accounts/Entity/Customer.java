package com.eazybytes.accounts.Entity;

import jakarta.persistence.*;
import lombok.*;


@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
@Entity
public class Customer extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String name;
    private String email;
    @Column(name = "mobile_number")
    private String mobileNumber;

}



