package com.sameer.dbtest.dto.response;

import com.sameer.dbtest.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponseDto {
    private Integer id;
    private String state;
    private String district;

    public AddressResponseDto(Address add){
        this.id=add.getId();
        this.state=add.getState();
        this.district=add.getDistrict();
    }
}
