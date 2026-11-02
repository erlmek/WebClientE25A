package org.example.webcliente25a.controller;

import org.example.webcliente25a.model.Student;
import org.example.webcliente25a.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    MyService myService;

    @GetMapping("/data")
    public String getData() {
        String res = myService.fetchHello();
        return res;
    }

    @GetMapping("/hellox")
    public String hellox() {
        return "Hellox";
    }

    @GetMapping("/hello/{sleep}")
    public String hello(@PathVariable int sleep) throws InterruptedException {
        System.out.println("hello kaldt vi står stille");
        Thread.sleep(sleep);
        System.out.println("hello kører videre");
        return "Hello World";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> res = myService.fetchStudents();
        return res;
    }



}