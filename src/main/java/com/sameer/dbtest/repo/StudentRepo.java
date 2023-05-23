package com.sameer.dbtest.repo;

import com.sameer.dbtest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
