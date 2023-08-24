package za.ac.cput.factory;

import za.ac.cput.domain.Account;

public class AccountFactory {
    public static Account createAccount(String accountNumber, String accountType){
        return new Account(accountNumber, accountType);
    }
}
