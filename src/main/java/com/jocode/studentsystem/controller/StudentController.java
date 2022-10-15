package com.jocode.studentsystem.controller;

import com.jocode.studentsystem.model.Student;
import com.jocode.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student Added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudent() {
        return  studentService.getAllStudent();
    }

}
