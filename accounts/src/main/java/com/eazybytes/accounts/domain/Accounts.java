package com.eazybytes.accounts.domain;

import jakarta.persistence.*;
import lombok.*;


@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
@Entity
@Builder
public class Accounts extends BaseEntity {



    @Column(name = "customer_Id")
    private Long customerId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNumber;
    @Column(name = "account_Type")
    private String accountType;
    @Column(name = "branch_address")
    private String branchAddress;


}



