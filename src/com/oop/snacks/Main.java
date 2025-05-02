package com.oop.snacks;

import java.math.BigDecimal;

import com.RegistroStudenti;

public class Main {
    public static void main(String[] args) {
        Studente s1 = new Studente("Alex", "Sartini", 26);
        Studente s2 = new Studente("AAAAAA", "Sartini", 16);

        System.out.println(s1.getStudentInfo());

        ContoBancario banck1 = new ContoBancario(1234);
        banck1.addCredit(new BigDecimal(120.50));
        System.out.println(banck1.getBalance());
        banck1.withdraw(new BigDecimal(2220.50));
        System.out.println(banck1.getBalance());

        RegistroStudenti register = new RegistroStudenti();
        register.addStudents(s1);
        register.addStudents(s2);
        System.out.println(register.getAllStudents());

    }
}
