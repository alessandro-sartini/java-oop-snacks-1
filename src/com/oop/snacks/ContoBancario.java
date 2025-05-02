package com.oop.snacks;

import java.math.BigDecimal;

public class ContoBancario {
    private int bankAccountNumber;
    private BigDecimal balance;

    public ContoBancario(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
        this.balance = new BigDecimal(0);
    }

    public void addCredit(BigDecimal addCredit) {
        if (addCredit.compareTo(BigDecimal.ZERO) > 0) {

            this.balance = balance.add(addCredit);
        } else {
            System.out.println("Non puoi aggiungere saldo 0 o negativo al conto");
        }
    }

    public void withdraw(BigDecimal removeCredit) {
        if (removeCredit.compareTo(BigDecimal.ZERO) > 0 && removeCredit.compareTo(this.balance) <= 0) {
            this.balance = balance.subtract(removeCredit);
        } else {
            System.out.println("Il saldo non e' disponibile");
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }
}
