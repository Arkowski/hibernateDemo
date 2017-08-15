package com.ak.controller;

import com.ak.entity.Student;
import com.ak.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;
import java.util.List;


@RestController
@RequestMapping("/studentservice")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addStudent(@RequestBody Student student) {
        studentService.add(student);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Student> getAll() {
        List<Student> list = (List<Student>) studentService.getAll();
        return list;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Student getById(@PathVariable Long id) {
        return studentService.getById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        studentService.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Student student) {
        studentService.update(student);
    }
}
