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

    @PutMapping
    public String putUser() {
        return "New User";
    }

}
