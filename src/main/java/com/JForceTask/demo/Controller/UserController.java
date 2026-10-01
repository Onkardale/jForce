package com.JForceTask.demo.Controller;

import com.JForceTask.demo.Entity.Feedback;
import com.JForceTask.demo.Entity.User;
import com.JForceTask.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:5173/")
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("/register")
    public User regUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return userService.loginUser(
                user.getEmail(),
                user.getPassword()
        );
    }

    @PostMapping("/feedback/{userId}")
    public User setFeedback(
            @PathVariable Long userId,
            @RequestBody Feedback feedback) {

        return userService.saveFeedback(userId, feedback);
    }
}