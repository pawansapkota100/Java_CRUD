package com.sameer.dbtest.dto.response;

import com.sameer.dbtest.entity.Student;

public class StudentResponseDto {
    private Integer id;
    private String name;

    public StudentResponseDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentResponseDto(Student std){
        this.id=std.getId();
        this.name=std.getName();
    }
    public StudentResponseDto(){}
}
