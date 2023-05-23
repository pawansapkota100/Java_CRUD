package com.sameer.dbtest.service;

import com.sameer.dbtest.dto.request.StudentRequestDto;
import com.sameer.dbtest.dto.response.StudentResponseDto;

public interface StudentService {
    StudentResponseDto saveStudent(StudentRequestDto std) throws Exception;
}
