package com.charan.service.impl;
import com.charan.model.Student;
import com.charan.repository.StudentRepository;
import com.charan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student create(Student student){
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll() ;
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public String deleteStudent(Integer id) {
         studentRepository.deleteById(id);
         return "Record Deleted";
    }

}
