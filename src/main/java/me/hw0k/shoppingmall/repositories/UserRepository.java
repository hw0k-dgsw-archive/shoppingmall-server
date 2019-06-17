package me.hw0k.shoppingmall.repositories;

import me.hw0k.shoppingmall.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
