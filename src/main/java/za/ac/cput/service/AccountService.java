package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Account;
import za.ac.cput.repository.AccountRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AccountService {
    private AccountRepository repository;

    @Autowired
    private AccountService(AccountRepository repository){this.repository = repository;}

    public Account save(Account account){return repository.save(account);}

    public Set<Account> getAll(){
        return repository.findAll().stream().collect(Collectors.toSet());
    }

    public List<Account> getAllByAccountType(String account){
        return repository.findAllByAccountType(account);
    }
}
