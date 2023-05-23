package com.sameer.dbtest.service.impl;
import com.sameer.dbtest.dto.request.AddressRequestDto;
import com.sameer.dbtest.dto.response.AddressResponseDto;
import com.sameer.dbtest.entity.Address;
import com.sameer.dbtest.repo.AddressRepo;
import com.sameer.dbtest.service.AddressService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepo addressRepo;
    public AddressServiceImpl(AddressRepo addressRepo){
        this.addressRepo=addressRepo;
    }

    @Override
    public AddressResponseDto saveAddress(AddressRequestDto add){
        Address address = new Address();
        address.setState(add.getState());
        address.setDistrict(add.getDistrict());
        Address savedAddress = addressRepo.save(address);
        AddressResponseDto addressResponseDto;
        addressResponseDto = new AddressResponseDto(savedAddress);
        return addressResponseDto;
    }

    @Override
    public List<AddressResponseDto> getAllAddress() {
        List<AddressResponseDto> returnList = new ArrayList<>();
        List<Address> addressList = addressRepo.findAll();
        for(Address address:addressList){
            AddressResponseDto addressResponseDto=new AddressResponseDto(address);
            returnList.add(addressResponseDto);
        }
        return returnList;

    }

    @Override
    public AddressResponseDto getAddressById(Integer id) {
        Address address = addressRepo.getById(id);
        return new AddressResponseDto(address);
    }

    @Override
    @Transactional
    public Integer deleteAddressById(Integer id) {
        addressRepo.deleteById(id);
        return id;
    }

    @Override
    public AddressResponseDto updateAddress(Integer id, AddressRequestDto addressRequestDto) {
        Address address = addressRepo.getById(id);
        address.setDistrict(addressRequestDto.getDistrict());
        address.setState(addressRequestDto.getState());
        Address savedAddress = addressRepo.save(address);
        return new AddressResponseDto(savedAddress);
    }
}
