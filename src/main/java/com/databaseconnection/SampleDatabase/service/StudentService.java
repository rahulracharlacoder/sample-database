package com.databaseconnection.SampleDatabase.service;

import com.databaseconnection.SampleDatabase.model.Student;
import com.databaseconnection.SampleDatabase.repository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRespository studentRespository;

    public String addStudent(Student student) {
        studentRespository.save(student);
        return "Student save successfully";
    }

    public List<Student> findallnames() {
        List<Student> list = studentRespository.findAll();
        return list;
    }

    public Student findbyid(int id) {
        Optional<Student> student = studentRespository.findById(id);
        return student.get();
    }

    public String removestudent(int id) {
        studentRespository.deleteById(id);
        return "Student detail deleted successfully";
    }

    public String updatestudentbody(int id, Student student) {
        Student student1 = findbyid(id);
        if(student1 != null) {
            studentRespository.save(student);
            return "Student detail updated";
        }
        else {
            return "Student id not found";
        }
    }

    public String updatestudentpatch(int id, String grade) {
        Student student = findbyid(id);
        if(student != null) {
            student.setGrade(grade);
            studentRespository.save(student);
            return "Student grade updated successfully";
        }
        else {
            return "Student id not found";
        }
    }
}
