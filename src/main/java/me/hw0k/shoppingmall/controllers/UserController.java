package me.hw0k.shoppingmall.controllers;

import lombok.*;
import me.hw0k.shoppingmall.models.User;
import me.hw0k.shoppingmall.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    private class LoginPayload {
        @Getter @Setter private String account;
        @Getter @Setter private String password;
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> list() {
        return userService.list();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getOne(@PathVariable Long id) {
        return userService.getOne(id);
    }

    @PostMapping("/")
    public ResponseEntity<User> create(@RequestBody User user) {
        return userService.create(user);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<User> create(@PathVariable Long id, @RequestBody User user) {
        return userService.update(id, user);
    }

    @DeleteMapping("/")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return userService.delete(id);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody LoginPayload payload) {
        return userService.login(payload.getAccount(), payload.getPassword());
    }
}
