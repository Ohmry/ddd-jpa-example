package io.ohmry.dddjpaexample.user;

import io.ohmry.dddjpaexample.core.annotations.UserInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@UserInterface
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    public UserController (UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public ResponseEntity<String> helloWorld () {
        return ResponseEntity.ok("Hello World!");
    }
}
