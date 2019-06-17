package me.hw0k.shoppingmall.repositories;

import me.hw0k.shoppingmall.models.Review;
import me.hw0k.shoppingmall.models.UserWithProductKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, UserWithProductKey> {
}
