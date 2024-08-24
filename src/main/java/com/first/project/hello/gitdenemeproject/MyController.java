package com.first.project.hello.gitdenemeproject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class MyController {

    @GetMapping
    public String getUser() {
        return "New User";
    }

}
