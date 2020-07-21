package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(111111);
        account.setBalance(100);
        account.setCustomerName("John Smith");
        account.setEmail("John@mail.com");
        account.setPhoneNumber("+359 888 12 34 56");

        System.out.println(account.getAccountNumber());
        account.depositFunds(200);
        account.withdrawFunds(305);
        account.withdrawFunds(300);
        System.out.println(account.getBalance());

    }
}
