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
    //delete method
    @DeleteMapping
    public void deleteUser() {
        System.out.println("User was deleted");
    }

}
