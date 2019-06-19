package me.hw0k.shoppingmall.services.implementations;

import me.hw0k.shoppingmall.models.User;
import me.hw0k.shoppingmall.repositories.UserRepository;
import me.hw0k.shoppingmall.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public ResponseEntity<List<User>> list() {
        if (userRepository.count() == 0) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(userRepository.findAll());
    }

    @Override
    public ResponseEntity<User> getOne(Long id) {
        Optional<User> target = userRepository.findById(id);
        if (!target.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(target.get());
    }

    @Override
    public ResponseEntity<User> create(User user) {
        if (userRepository.findByAccount(user.getAccount()).isPresent()
            || userRepository.findByEmail(user.getEmail()).isPresent()
            || userRepository.findByPhoneNumber(user.getPhoneNumber()).isPresent()
        ) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }

        User target = userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(target);
    }

    @Override
    public ResponseEntity<User> update(Long id, User user) {
        // TODO: Implement Method
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        // TODO: Implement Method
        throw new NotImplementedException();
    }

    @Override
    public ResponseEntity<User> login(String account, String password) {
        Optional<User> target = userRepository.findByAccountAndPassword(account, password);
        if (!target.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(target.get());
    }

}
