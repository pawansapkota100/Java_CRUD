package com.sameer.dbtest.service;

import com.sameer.dbtest.dto.request.AddressRequestDto;
import com.sameer.dbtest.dto.response.AddressResponseDto;

import java.util.List;

public interface AddressService {

    AddressResponseDto saveAddress(AddressRequestDto add);
    List<AddressResponseDto> getAllAddress();
    AddressResponseDto getAddressById(Integer id);
    Integer deleteAddressById(Integer id);
    AddressResponseDto updateAddress(Integer id,AddressRequestDto addressRequestDto);
}
