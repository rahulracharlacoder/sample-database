package com.databaseconnection.SampleDatabase.controller;

import com.databaseconnection.SampleDatabase.model.Student;
import com.databaseconnection.SampleDatabase.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public String saveStudent(@RequestBody Student student) {
        String response = studentService.addStudent(student);
        return response;
    }

    @GetMapping("/getallnames")
    public List<Student> getnames() {
        List<Student> listnames = studentService.findallnames();
        return listnames;
    }

    @GetMapping("/getbystudentId/{id}")
    public Student getbystudentId(@PathVariable int id) {
        Student student = studentService.findbyid(id);
        return student;
    }

    @DeleteMapping("/delete/{id}")
    public String deletestudent(@PathVariable int id) {
        String response = studentService.removestudent(id);
        return response;
    }

    @PutMapping("/updateall/{id}")
    public String updatebyput(@PathVariable int id, @RequestBody Student student) {
        String response = studentService.updatestudentbody(id, student);
        return response;
    }

    @PatchMapping("/update/{id}")
    public String update(@PathVariable int id, @RequestParam String grade) {
        String response = studentService.updatestudentpatch(id, grade);
        return response;
    }
}
