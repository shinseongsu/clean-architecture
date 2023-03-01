package com.clean.project.core.dataprovider;

import com.clean.project.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);

}
