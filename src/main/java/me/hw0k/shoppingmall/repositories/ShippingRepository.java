package me.hw0k.shoppingmall.repositories;

import me.hw0k.shoppingmall.models.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepository extends JpaRepository<Shipping, Long> {
}
