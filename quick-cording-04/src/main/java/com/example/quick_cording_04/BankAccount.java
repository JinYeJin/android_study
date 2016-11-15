package com.example.quick_cording_04;

/**
 * Created by Jin on 11/15/2016.
 */
public class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
        System.out.println("총합 : " + balance + " " + money + " 만큼 입금");
    }

    public void withdraw(int money) {
        balance -= money;
        System.out.println("총합 : " + balance + " " + money + " 만큼 출금");
    }
}

