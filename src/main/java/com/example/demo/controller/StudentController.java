package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseBody;
import com.example.demo.repository.StudentRepository;
import java.util.List;
import com.example.demo.model.Student;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentrepo;

    @GetMapping("/")
    public List<Student> getAllStudents() {
        return studentrepo.findAll();
    }
    @PostMapping("/studentregister"){
        @ResponseBody

    }

}
