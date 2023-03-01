package com.clean.project.core.usecase.impl;

import com.clean.project.core.dataprovider.FindAddressByZipCode;
import com.clean.project.core.dataprovider.InsertCustomer;
import com.clean.project.core.domain.Customer;
import com.clean.project.core.usecase.InsertCustomerUserCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUserCase {

    private final FindAddressByZipCode findAddressByZipCode;
    private final InsertCustomer insertCustomer;

    public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
    }
}
