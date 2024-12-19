package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.domain.Customer;
import com.eazybytes.accounts.dto.CustomerDto;

public class CustomersMapper {

    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {

        return Customer
                .builder()
                .email(customerDto.getEmail())
                .name(customerDto.getName())
                .build();
    }

}
