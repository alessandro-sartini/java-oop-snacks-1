package com.oop.snacks;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Studente s1 = new Studente("Alex", "Sartini", 26);
        System.out.println(s1.getStudentInfo());

        ContoBancario banck1 = new ContoBancario(1234);
        banck1.addCredit(new BigDecimal(120.50));
        System.out.println(banck1.getBalance());
        banck1.withdraw(new BigDecimal(2220.50));
        System.out.println(banck1.getBalance());
    }
}
