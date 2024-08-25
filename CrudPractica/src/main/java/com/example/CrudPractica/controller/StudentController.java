package com.example.CrudPractica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrudPractica.entity.Student;
import com.example.CrudPractica.service.StudentService;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAll() {
        return studentService.getStudents();
    }

    @GetMapping("{/studentId}")
    public Student getStudentById(@PathVariable("studentId") Long studentId) {
        return studentService.getStudentById(studentId).orElse(null);
    }

    @PostMapping
    public void Save(@RequestBody Student student) {
        studentService.saveOrUpdate(student);
    }

    @DeleteMapping("{/studentId}")
    public void Delete(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }

}
