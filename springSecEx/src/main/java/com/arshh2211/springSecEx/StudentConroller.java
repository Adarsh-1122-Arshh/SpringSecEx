package com.arshh2211.springSecEx;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentConroller {

    public List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Adarsh1122", 99),
            new Student(2, "basava raju", 92),
            new Student(3, "Govind guptha", 88)
    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/csrf_token")
    public CsrfToken getCsrf_token(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public Student postStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }
}
