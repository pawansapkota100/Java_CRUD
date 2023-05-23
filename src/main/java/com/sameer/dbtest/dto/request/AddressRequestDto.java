package com.sameer.dbtest.dto.request;

import com.sameer.dbtest.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressRequestDto {
    private String state;
    private String district;

}
