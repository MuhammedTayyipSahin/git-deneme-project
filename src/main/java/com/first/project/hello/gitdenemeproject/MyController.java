package com.first.project.hello.gitdenemeproject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class MyController {

    @GetMapping
    public String getUser() {
        return "New User";
    }

    @PostMapping
    public String postUser() {
        return "New User";
    }

    @DeleteMapping
    public String deleteUser() {
        return "New User";
    }

}
