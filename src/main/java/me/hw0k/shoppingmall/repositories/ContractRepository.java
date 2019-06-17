package me.hw0k.shoppingmall.repositories;

import me.hw0k.shoppingmall.models.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}
