package me.hw0k.shoppingmall.services;

import me.hw0k.shoppingmall.models.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<List<User>> list();
    ResponseEntity<User> getOne(Long id);
    ResponseEntity<User> create(User user);
    ResponseEntity<User> update(Long id, User user);
    ResponseEntity<Void> delete(Long id);
    ResponseEntity<User> login(String account, String password);
}
