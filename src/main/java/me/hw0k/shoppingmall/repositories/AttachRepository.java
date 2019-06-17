package me.hw0k.shoppingmall.repositories;

import me.hw0k.shoppingmall.models.Attach;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AttachRepository extends JpaRepository<Attach, UUID> {
}
