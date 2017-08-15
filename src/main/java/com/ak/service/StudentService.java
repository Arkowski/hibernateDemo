package com.ak.service;

import com.ak.entity.Student;

import java.util.Collection;

public interface StudentService {

    Collection<Student> getAll();

    Student getById(Long id);

    void deleteById(Long id);

    void add(Student student);

    void update(Student student);

}
