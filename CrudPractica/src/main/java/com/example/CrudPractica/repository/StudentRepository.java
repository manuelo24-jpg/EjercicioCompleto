package com.example.CrudPractica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CrudPractica.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
