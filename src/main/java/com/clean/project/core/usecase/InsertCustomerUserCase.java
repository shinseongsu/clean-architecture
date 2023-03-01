package com.clean.project.core.usecase;

import com.clean.project.core.domain.Customer;

public interface InsertCustomerUserCase {

    void insert(Customer customer, String zipCode);

}
