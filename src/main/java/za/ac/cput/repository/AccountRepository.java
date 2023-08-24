package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Account;
import za.ac.cput.domain.AccountId;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, AccountId> {
    public List<Account> findAllByAccountType(String accountType);
}
