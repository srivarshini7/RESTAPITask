package com.RestAPITask.Repo;

import com.RestAPIsTask.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    Student findByName(String studentName);
    //no need to write any additional connections here,
    // since they are mentioned in the application properties folder
}
