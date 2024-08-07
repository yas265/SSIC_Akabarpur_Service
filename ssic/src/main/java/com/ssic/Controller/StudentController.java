package com.ssic.Controller;


import com.ssic.Model.Student;
import com.ssic.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    public StudentService studentService;

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "test";
    }

    @GetMapping("/students")
    @ResponseBody
    public List<Student> getAllStudents() {
        List<Student> students = studentService.getAllStudent();
        System.out.println(students);
        return students;
    }
}
