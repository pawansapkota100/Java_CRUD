package com.sameer.dbtest.service.impl;
import com.sameer.dbtest.dto.request.StudentRequestDto;
import com.sameer.dbtest.dto.response.StudentResponseDto;
import com.sameer.dbtest.entity.Address;
import com.sameer.dbtest.entity.Student;
import com.sameer.dbtest.repo.AddressRepo;
import com.sameer.dbtest.repo.StudentRepo;
import com.sameer.dbtest.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;
    private final AddressRepo addressRepo;
//    public StudentServiceImpl(StudentRepo studentRepo) {
//        this.studentRepo=studentRepo;
//    }


    @Override
    public StudentResponseDto saveStudent(StudentRequestDto std) throws Exception {
        Student student = new Student();
        student.setName(std.getName());
        Address address = addressRepo.getById(std.getAddressId());
        if(address == null){
            throw new Exception("id not present");
        }
        student.setAddress(address);
        Student savedStudent = studentRepo.save(student);
        StudentResponseDto studentResponseDto = new StudentResponseDto(savedStudent);
        return studentResponseDto;
    }
}
