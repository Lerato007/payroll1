package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Account;
import za.ac.cput.factory.AccountFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class AccountServiceTest {
    @Autowired
    private AccountService service;

    private static Account account1 = AccountFactory.createAccount("123", "CURRENT");
    private static Account account2 = AccountFactory.createAccount("234", "SAVINGS");
    private static Account account3 = AccountFactory.createAccount("345", "SAVINGS");
    private static Account account4 = AccountFactory.createAccount("456", "CURRENT");
    private static Account account5 = AccountFactory.createAccount("567", "CURRENT");

    @Order(1)
    @Test
    public void saveAll(){
        Account created1 = service.save(account1);
        Account created2 = service.save(account2);
        Account created3 = service.save(account3);
        Account created4 = service.save(account4);
        Account created5 = service.save(account5);
        assertNotNull(created1);
        assertNotNull(created2);
        assertNotNull(created3);
        assertNotNull(created4);
        assertNotNull(created5);
    }

    @Order(2)
    @Test
    public void showAll(){
        System.out.println("Show all:");
        System.out.println(service.getAll());
    }

    @Order(3)
    @Test
    public void showAllByAccountType(){
        final String ACCOUNT_TYPE = "SAVINGS";
        System.out.println("Show all by account type: " + ACCOUNT_TYPE);
        System.out.println(service.getAllByAccountType(ACCOUNT_TYPE));
    }
}