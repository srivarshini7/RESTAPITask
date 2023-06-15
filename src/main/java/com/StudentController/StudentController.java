package com.StudentController;


import com.RestAPITask.Repo.StudentRepo;
import com.RestAPIsTask.entity.Student;
import com.StudentServicePackage.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

//    post methods
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }
    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return service.saveStudents(students);
    }
    @GetMapping("/student")
    public List<Student> findAllStudent(){
        System.out.println("hello world");
        return service.getStudents();

    }
    @GetMapping("/student/{id}")
    public Student findStudentById(@PathVariable long id){
        return service.getStudentById(id);
    }
    @GetMapping("/student/{studentName}")
    public Student findStudentByName(@PathVariable String studentName){
        return service.getStudentByName(studentName);
    }
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable long id){
        return service.deleteStudent(id);
    }
}
