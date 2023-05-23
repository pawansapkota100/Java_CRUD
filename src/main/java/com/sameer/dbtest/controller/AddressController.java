package com.sameer.dbtest.controller;

import com.sameer.dbtest.dto.request.AddressRequestDto;
import com.sameer.dbtest.dto.response.AddressResponseDto;
import com.sameer.dbtest.service.AddressService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService){
        this.addressService=addressService;
    }
    @PostMapping("/save")
    @Operation(summary = "save address")
    public ResponseEntity<AddressResponseDto> saveAddress(@RequestBody AddressRequestDto add){
        return new ResponseEntity<>(addressService.saveAddress(add), HttpStatus.CREATED);
    }

    @GetMapping("/find-all")
    @Operation(summary = "get address")
    public ResponseEntity<?> getAllAddress(){
        return new ResponseEntity<>(addressService.getAllAddress(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    @Operation(summary = "Get address by id")
    public ResponseEntity<?> getAddressById(@PathVariable Integer id){
        return new ResponseEntity<>(addressService.getAddressById(id),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    @Operation(summary = "delete")
    public ResponseEntity<?> deleteAddressById(@PathVariable Integer id){
        return new ResponseEntity<>(addressService.deleteAddressById(id),HttpStatus.OK);
    }
    @PutMapping("/{id}")
    @Operation(summary = "update")
    public ResponseEntity<?> updateAddress(@PathVariable Integer id,@RequestBody AddressRequestDto addressRequestDto){
        return new ResponseEntity<>(addressService.updateAddress(id,addressRequestDto),HttpStatus.OK);
    }
}
