package com.StudentController;


import com.RestAPIsTask.entity.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @PostMapping("api/students")
    public void savesStudents(@RequestBody Student student){
        System.out.println(student);
    }

}
