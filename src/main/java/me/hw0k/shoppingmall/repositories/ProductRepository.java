package me.hw0k.shoppingmall.repositories;

import me.hw0k.shoppingmall.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
