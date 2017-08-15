package com.ak.service;

import com.ak.dao.StudentRepository;
import com.ak.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Collection<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getById(Long id) {
        return studentRepository.getOne(id);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.delete(id);
    }

    @Override
    public void add(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void update(Student student) {
        studentRepository.save(student);

    }
}
