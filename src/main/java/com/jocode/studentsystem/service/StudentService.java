package com.jocode.studentsystem.service;

import com.jocode.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent (Student student);
    public List<Student> getAllStudent();


}
