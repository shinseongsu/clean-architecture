package com.clean.project.dataprovider;

import com.clean.project.core.dataprovider.FindAddressByZipCode;
import com.clean.project.core.domain.Address;
import com.clean.project.dataprovider.client.FindAddressByZipCodeClient;
import com.clean.project.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}
