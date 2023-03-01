package com.clean.project.dataprovider.client.mapper;

import com.clean.project.core.domain.Address;
import com.clean.project.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
