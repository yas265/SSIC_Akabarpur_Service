package com.ssic.Service;

import com.ssic.Model.Student;
import com.ssic.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent()
    {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student)
    {
        return studentRepository.save(student);
    }
}
