package com.StudentServicePackage;


import com.RestAPITask.Repo.StudentRepo;
import com.RestAPIsTask.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo repository;

//post method
    public Student saveStudent(Student student){
       return repository.save(student);
    }
    //post method
    public List<Student> saveStudents(List<Student> students){
        return repository.saveAll(students);
    }
//get method
    public List<Student> getStudents(){
        return repository.findAll();
    }

//get by Id method
    public Student getStudentById(long id){
        return repository.findById(id).orElse(null);
    }

    //get by Id method

    public Student getStudentByName(String studentName){
        return repository.findByName(studentName);
    }

//delete method
    public String deleteStudent(long id){
        repository.deleteById(id);
        return "Student Removed!!" + id;
    }

//update method

    public Student updateStudent (Student student){
       Student existingStudent= repository.findById(student.getId()).orElse(null);
        existingStudent.setStudentName(student.getStudentName());
        existingStudent.setStudentEmail(student.getStudentEmail());
        existingStudent.setStudentAddress(student.getStudentAddress());
        return repository.save(existingStudent);
    }
}
