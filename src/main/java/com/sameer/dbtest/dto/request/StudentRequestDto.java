package com.sameer.dbtest.dto.request;

import com.sameer.dbtest.dto.response.StudentResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequestDto {
    private String name;
    private Integer addressId;
}
