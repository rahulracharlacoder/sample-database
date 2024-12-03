package com.databaseconnection.SampleDatabase.repository;

import com.databaseconnection.SampleDatabase.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRespository extends JpaRepository<Student, Integer> {
}
