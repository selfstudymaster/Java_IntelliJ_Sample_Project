package main;

import static main.AccountType.FUTSU;
import static main.AccountType.TOUZA;
import static main.AccountType.TEIKI;

public class Account implements Comparable<Account> {
    int number;
    public int compareTo(Account obj) {
        if (this.number < obj.number) {
            return -1;
        }
        if (this.number > obj.number) {
            return 1;
        }
        return 0;
    }

    String accountNo;
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Account)) {
            return false;
        }
        Account r = (Account) o;
        if (!this.accountNo.trim().equals(r.accountNo.trim())) {
            return false;
        }
        return true;
    }

    private int balance;
    private AccountType accountType;
    public Account(String aNo, AccountType aType) {

    }
}
