package net.ayoub.ebankservice.repository;

import net.ayoub.ebankservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BankAccountRepository extends JpaRepository<BankAccount, UUID> {

    List<BankAccount> findByCustomerId(Long customerId);
}
